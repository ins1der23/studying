using System.Security.Cryptography.X509Certificates;
using System.Diagnostics;
using static ArrayCreator;
using static ArrayMath;

int[] array = 500000.Create()
                .Fill(1, 10);
// array.ConvertToString();
int n = 100000;
int m;
Stopwatch sw = new Stopwatch();
sw.Start();
m = array.BadGetSum(n);
sw.Stop();
Console.WriteLine($"BadGetSum: {m} => {sw.ElapsedMilliseconds}");
sw.Reset();
sw.Start();
m = array.GoodGetSum(n);
sw.Stop();
Console.WriteLine($"GoodGetSum: {m} => {sw.ElapsedMilliseconds}");


