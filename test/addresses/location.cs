using MySql.Data.MySqlClient;
using Dapper;
using Data;

namespace Models
{
    class Location
    {
        static int nextId;
        public int Id { get; private set; }
        public string? Name { get; set; }
        public int CityId { get; private set; }
        public virtual City City { get; set; }

        public Location()
        {
            Id = Interlocked.Increment(ref nextId);
            City = new();
        }
        public override string ToString() => $"{City.Name}, ID:{Id}, {Name}";
    }

    class Locations
    {
        List<Location> LocationsList { get; set; }

        public Locations()
        {
            LocationsList = new();
        }
        public async Task GetFromSqlAsync(DBConnection user, string search = "")
        {
            await user.ConnectAsync();
            if (user.IsConnect)
            {
                string selectQuery = $@"select *
                                    from locations as l, cities as c 
                                    where l.cityId=c.Id 
                                    and (l.name like ""%{search}%"")
                                    order by l.name";
                var temp = await user.Connection.QueryAsync<Location, City, Location>(selectQuery, (l, c) =>
                {
                    l.City = c;
                    return l;
                });
                LocationsList = temp.ToList();
                user.Close();
            }
        }
        public override string ToString()
        {
            string output = String.Empty;
            foreach (var location in LocationsList)
                output += location.ToString() + "\n";
            return output;
        }



    }
}