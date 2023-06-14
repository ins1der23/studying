using System.Runtime.InteropServices;
using System.Linq;
using System;
double number = 1230.45;
string toString = $"{number}";
Console.WriteLine(toString);

toString = number.ToString();
Console.WriteLine(toString);
toString = toString.Replace(",", "");
Console.WriteLine(toString);
// int sum = 0;
// foreach (var digit in toString)
// {
//     sum += digit - '0';
//     Console.WriteLine(sum);
// }

toString = toString.Substring(1, toString.Length - 2);
Console.WriteLine(toString);


// "This is an example!" ==> "sihT si na !elpmaxe"
// "double  spaces"      ==> "elbuod  secaps"

string sentence = "double  spaces";

var result = String.Join(" ", sentence.Split().Select(x => String.Concat(x.Reverse())));
                     



 Console.WriteLine(result);
 Console.WriteLine(String.Join(" ",result));
