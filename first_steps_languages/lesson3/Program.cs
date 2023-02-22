using System;

int[] CreateArray(int size)
{
    return new int[size];
}

int[] NextArray = CreateArray(size: 30);
//  void methods
// ничего не принимает и не возвращает

void NewMethod1()
{
    Console.WriteLine("Автор Задорин М.Н.");
}
NewMethod1();

// принимают, но не возвращают



void FillMassive(int[] collection)
{
    int length = collection.Length;
    int index = 0;
    while (index < length)
    {
        collection[index] = new Random().Next(1, 99);
        index++;
    }
}
void PrintMassive(int[] col)
{
    int count = col.Length;
    int position = 0;
    while (position < count)
    {
        Console.Write($"{col[position]} ");
        position++;
    }
    Console.WriteLine(" ");
}
FillMassive(NextArray);
PrintMassive(NextArray);

// не принимают, но возвращают

int Method3()
{
    return DateTime.Now.Year;
}

int year = Method3();
Console.WriteLine(year);

// принимают и возвращают

string Method4(int count, string text)
{
    int i = 0;
    string result = String.Empty;
    while (i < count)
    {
        result = result + text + " ";
        i++;
    }
    return result;
}

string hello = Method4(text: "Hello", count: 10);
Console.WriteLine(hello);

// цикл for

string Method5(int count, string text)
{
    string result = String.Empty;
    for (int i = 0; i < count; i++)
    {
        result = result + text + "   ";
    }
    return result;
}
string bye = Method5(10, "Bye");
Console.WriteLine(bye);

// цикл в цикле

for (int i = 2; i <= 10; i++)
{
    for (int j = 2; j <= 10; j++)
    {
        System.Console.WriteLine($"{i} x {j} = {i * j}");
    }
    Console.WriteLine();
}

//=====Работа с текстом
// Дан текст. В тексте нужно все пробелы заменить чёрточками,
// маленькие буквы “к” заменить большими “К”,
// а большие “С” маленькими “с”.
// Ясна ли задача?

string text = "— Я думаю, — сказал князь, улыбаясь, — что,"
+ "ежели бы вас послали вместо нашего милого Винценгероде,"
+ "вы бы взяли приступом согласие прусского короля."
+ "Вы так красноречивы. Вы дадите мне чаю?";

// string s = “qwerty”
// 012345
// s[3] // r

string Replace(string text, char oldValue, char newValue)
{
    string result = String.Empty;
    int length = text.Length;
    for (int i = 0; i < length; i++)
    {
        if (text[i] == oldValue) result = result + newValue;
        else result = result + text[i];
    }
    return result;
}

string newText = Replace(text, ' ', '|');
System.Console.WriteLine(newText);

// упорядочить массив

PrintMassive(NextArray);

void SelectionSort(int[] AnyArray)
{
    for (int i = 0; i < AnyArray.Length - 1; i++)
    {
        int minPosition = i;

        for (int j = i + 1; j < AnyArray.Length; j++)
        {
            if (AnyArray[j] < AnyArray[minPosition]) minPosition = j;
        }

        int temp = AnyArray[i];
        AnyArray[i] = AnyArray[minPosition];
        AnyArray[minPosition] = temp;
    }
}

SelectionSort(NextArray);
PrintMassive(NextArray);