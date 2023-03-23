using System.Drawing;
using System.Linq;

// парсинг

string text = "(1,2) (2,3) (4,5) (6,7)"
                .Replace("(", "")
                .Replace(")", "");
Console.WriteLine(text);
var data = text.Split(" ")
                .Select(item => item.Split(','))
                .Select(e => (x: int.Parse(e[0]), y: int.Parse(e[1])))
                .Where(e => e.x % 2 == 0)
                .Select(point => (point.x * 10, point.y))
                .ToArray();
for (int i = 0; i < data.Length; i++)
{
    Console.WriteLine(data[i]);
    Console.WriteLine();
}


string coord = "1,2";
Console.WriteLine(coord);
var coordSheet = coord.Split(",")
                      .Select(e => (int.Parse(e)))
                      .ToArray();

Console.WriteLine(coordSheet[1]);
Console.WriteLine();
