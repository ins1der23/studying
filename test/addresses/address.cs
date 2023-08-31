using MySql.Data.MySqlClient;
using Dapper;
using Data;
using System.Linq;

namespace Models
{
    class Address
    {
        static int nextId;
        public int Id { get; set; }
        public int CityId { get; set; }
        public virtual City City { get; set; }
        public int DistrictId { get; set; }
        public virtual District District { get; set; }
        public int LocationId { get; set; }
        public virtual Location Location { get; set; }

        public int StreetId { get; set; }
        public virtual Street Street { get; set;}
        public string? HouseNum { get; set; }

        public Address()
        {
            Id = Interlocked.Increment(ref nextId);
            City = new();
            District = new();
            Location = new();
            Street = new();
        }

        public override string ToString() => $"ID:{Id}, {City.Name}, {District.Name}, {Location.Name}, {Street.Name}, {HouseNum}";
    }

    class Addresses
    {
        List<Address> AddressList { get; set; }
        public Addresses()
        {
            AddressList = new();
        }
        public async Task GetFromSqlAsync(DBConnection user, string search = "")
        {
            await user.ConnectAsync();
            if (user.IsConnect)
            {
                var sql = @"select s.id, s.name
                            from streets as s
                            where 1 = 1;
                            select
                            a.Id, a.streetId, a.houseNum
                            from addresses as a
                            where 1 = 1;";


                using (var temp = user.Connection.QueryMultiple(sql))
                {
                    var streets = temp.Read<Street>();
                    var addresses = temp.Read<Address>();
                    addresses = addresses.Select(x => new Address
                    {
                        Id = x.Id,
                        StreetId = x.StreetId,
                        HouseNum = x.HouseNum,
                        Street = streets.Where(y => y.Id == x.StreetId).FirstOrDefault(),
                    });
                    AddressList = addresses.ToList();
                }

               // var temp = await user.Connection.QueryAsync<Address>(selectQuery);


                // AddressList.ToList();
                user.Close();
            }
        }

        public override string ToString()
        {
            string output = String.Empty;
            foreach (var address in AddressList)
                output += address.ToString() + "\n";
            return output;
        }
    }


}