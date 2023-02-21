using System.Linq.Expressions;
// дан массив: наполнен числами от 1 до N
// Задача: сколько раз какое число встречается
// 0 1 2 3 4 5 6 7 8 9 
// 1 3 1 2 1 2 4 5 1 2 

// 1 - 4р
// 2 - 3р
// 3 - 1р
// 4 - 2р
// 5 - 2р
int Getnumber(string text)
{
    System.Console.Write(text);
    return int.Parse(Console.ReadLine());
}
int[] CreateArray(int size)
{
  return new int[size];
}
string FillAndPrintArray(int[] SomeArray)
{
    string output = String.Empty;
    int size = SomeArray.Length;
    int index = 0;
    while (index < size)
    {
        SomeArray[index] = new Random().Next(1, 10);
        output = output + " " + SomeArray[index];
        index++;
    }
    return output;
}
string PrintArray(int[] SomeArray)
{
    string output = String.Empty;
    int size = SomeArray.Length;
    int index = 0;
    while (index < size)
    {
        output = output + " " + SomeArray[index];
        index++;
    }

    return output;
}
void SortArray(int[] SomeArray)
{
    int TempSize = SomeArray.Length;
    int MaxIndex = 1;
    int InsideIndex = 0;
    int temp = 0;
    while (TempSize > 0)
    {
        while (InsideIndex < TempSize)
        {
            if (SomeArray[InsideIndex] > SomeArray[MaxIndex])
            {
                MaxIndex = InsideIndex;
            }
            InsideIndex++;
        }
        temp = SomeArray[TempSize - 1];
        SomeArray[TempSize - 1] = SomeArray[MaxIndex];
        SomeArray[MaxIndex] = temp;
        MaxIndex = 0;
        InsideIndex = 0;
        TempSize--;
    }
}
void FindNumbers(int[] SomeArray)
{
    int TempSize = SomeArray.Length;
    int index = TempSize - 1;
    int ToFind = SomeArray[TempSize - 1];
    int Counter = 0;
    while (TempSize >= 0)
    {
        while (index >= 0)
        {
            if (ToFind == SomeArray[index])
            {
                Counter++;
            }
            index--;
        }
        Console.WriteLine("Число {0} встречается {1}р.", ToFind, Counter);
        TempSize = TempSize - Counter;
        if (TempSize <= 0) break;
        ToFind = SomeArray[TempSize - 1];
        index = TempSize - 1;
        Counter = 0;
    }
}


int size = Getnumber("Введите размер массива ");
int[] NextArray = CreateArray(size);
System.Console.WriteLine(FillAndPrintArray(NextArray));
SortArray(NextArray);
System.Console.WriteLine(PrintArray(NextArray));
FindNumbers(NextArray);

