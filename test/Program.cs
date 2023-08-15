using System.Reflection;
using System.Collections.Specialized;
using System.Text;
using System.Data.Common;
using System.Runtime.InteropServices;
using System.Linq;
using System;
using MySql.Data.MySqlClient;
using Data;
using Dapper;
using Models;

DBConnection user = DBConnection.Instance("localhost", "oilproject");
bool connectFlag = false;
while (!connectFlag)
{
    user = DBConnection.Instance("localhost", "oilproject");
    await user.ConnectAsync();
    connectFlag = user.IsConnect();
}
user.Close();

await user.ConnectAsync();

string selectQuery = $@"select * from positions";
var positions = user.Connection.Query<Position>(selectQuery).ToList();

selectQuery = $@"select * from workers where positionId = @positionId";
var workers = user.Connection.Query<Worker>(selectQuery, new { positionId = 1 }).ToList();







foreach (var position in positions)
{
    Console.WriteLine(position);
}

foreach (var worker in workers)
{
    Console.WriteLine($"{worker.Id}. {worker.FullName} {worker.Age} {positions[worker.PositionId - 1].Name}");
}

user.Close();










