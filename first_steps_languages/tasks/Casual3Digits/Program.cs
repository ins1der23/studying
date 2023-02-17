using System.Threading;
// Задать массив, заполнить случайными положительными трёхзначными числами. Показать количество нечeтных\четных чисел

void FillAndPrintArray(int[] AnyArray)
{
    int size = AnyArray.Length;
    int index = 0;
    while (index < size)
    {
        AnyArray[index] = new Random().Next(100, 105);
        Console.Write(" {0}", AnyArray[index]);
        index++;
    }
    Console.WriteLine(" ");
}
(int, int) CountEven(int[] AnyArray)
{
    int size = AnyArray.Length;
    int index = 0;
    int EvenCount = 0;
    int OddCount = 0;
    while (index < size)
    {
        if (AnyArray[index] % 2 == 0) EvenCount = EvenCount + 1;
        index ++;
    }
    OddCount = size - EvenCount;
    return (EvenCount, OddCount); // вовращаются как свойсво var Counter = CountEven(SomeArray) ==> Counter.Item1, Counter.Item2
}
 int[] SomeArray = new int[20];
 FillAndPrintArray(SomeArray);
var Counter = CountEven(SomeArray);
 Console.WriteLine("Even - {0}, Odd - {1}",CountEven(SomeArray).Item1, CountEven(SomeArray).Item2); //можно Counter.Item1, Counter.Item2);