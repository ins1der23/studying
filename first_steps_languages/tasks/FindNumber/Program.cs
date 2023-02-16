// // Определить, присутствует ли в заданном массиве, некоторое число
// using Internal;
// using System;

void FillAndPrintArray(int[] AnyArray)
{
    int index = 0;
    int size = AnyArray.Length;
    while (index < size)
    {
        AnyArray[index] = new Random().Next(1, 20);
        Console.Write("{0} ", AnyArray[index]);
        index++;
    }
    Console.WriteLine(" ");
}
bool CheckNumber(int[] AnyArray, int SomeNumber)
{
    int index = 0;
    int size = AnyArray.Length;
    while (index < size)
    {
        if (AnyArray[index] == SomeNumber)
        {
            return true;
        }

        index++;
    }
    return false;
}
int ToNumber(string message)
{
    Console.Write(message);
    int result = int.Parse(Console.ReadLine());
    return result;
}

int[] SomeArray = new int[20];
FillAndPrintArray(SomeArray);
int SomeNumber = ToNumber("Введите число ");
Console.WriteLine(CheckNumber(SomeArray, SomeNumber));