using System.Xml.Serialization;
// Реализовать перемешивание массива 
// using Internal;
// using System;
void FillAndPrintArray(int[] AnyArray)
{
    int size = AnyArray.Length;
    int index = 0;
    while (index < size)
    {
        AnyArray[index] = new Random().Next(10, 100);
        Console.Write("{0} ", AnyArray[index]);
        index++;
    }
    Console.WriteLine(" ");
}

void PrintArray(int[] SomeArray)
{
    int size = SomeArray.Length;
    int index = 0;
    while (index < size)
    {
        Console.Write("{0} ", SomeArray[index]);
        index++;
    }
    Console.WriteLine(" ");
}
void MessArray(int[] AnyArray)
{
    int size = AnyArray.Length;
    int index = 0;
    int MessIndex = new Random().Next(0, size - 1);
    int temp = 0;
    while (index < size)
    {
        temp = AnyArray[MessIndex];
        AnyArray[MessIndex] = AnyArray[index];
        AnyArray[index] = temp;
        MessIndex = new Random().Next(0, size - 1);
        index++;
    }
}

int[] SomeArray = new int[20];
FillAndPrintArray(SomeArray);
MessArray(SomeArray);
PrintArray(SomeArray);