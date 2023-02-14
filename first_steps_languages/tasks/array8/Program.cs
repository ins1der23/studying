// Задать массив из 8 элементов и вывести их на экран (c#)


void FillOutputMassive(int[] AnyArray)
{
    int size = AnyArray.Length;
    int index = 0;
    while (index < size)
    {
        AnyArray[index] = new Random().Next(1, 10);
        Console.Write("{0} ", AnyArray[index]);
        index++;
    }
    Console.WriteLine(" ");
}
int[] SomeArray = new int[8];

FillOutputMassive(SomeArray);


