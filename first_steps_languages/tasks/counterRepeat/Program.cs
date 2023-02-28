using static Shared;


int size = GetInteger("Введите размер таблицы");
int[] someArray = CreateArray(size);
FillIntArrayRandom(someArray);
Console.WriteLine(ArrayToString(someArray));
var peak = MinMax(someArray);
Console.WriteLine($"{peak.Item1}, {peak.Item2}");
Console.WriteLine(CounterRepeat(someArray, peak.Item1, peak.Item2));