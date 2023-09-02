using System.Reflection;
using System.Collections.Specialized;
using System.Text;
using System.Data.Common;
using System.Runtime.InteropServices;
using System.Linq;
using System;
using MySql.Data.MySqlClient;
using Connection;
using Dapper;
using Models;

DBConnection user = DBConnection.Instance("localhost", "oilproject");
bool connectFlag = false;
while (!connectFlag)
{
    user = DBConnection.Instance("localhost", "oilproject");
    await user.ConnectAsync();
    connectFlag = user.IsConnect;
}
user.Close();

Locations locations = new Locations();

await locations.GetFromSqlAsync(user);
Console.WriteLine(locations);

Addresses addresses= new Addresses();

await addresses.GetFromSqlAsync(user);
Console.WriteLine(addresses);

user.Close();










