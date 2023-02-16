// Написать программу замену элементов массива на противоположные

void FillAndPrintArray(int[] AnyArray)
{
    int size = AnyArray.Length;
    int index = 0;
    while (index < size)
    {
        AnyArray[index] = new Random().Next(1, 999);
        Console.Write("{0} ", AnyArray[index]);
        index++;
    }
    Console.WriteLine(" ");
}
void PrintArray(int[] col)
{
    int count = col.Length;
    int position = 0;
    while (position < count)
    {
        Console.Write("{0} ", col[position]);
        position++;
    }
}
void UpsideDownArray(int[] Arr)
{
    int CountUp = 0;
    int CountDown = Arr.Length - 1;
    int temp = 0;
    while (CountUp < Arr.Length / 2)
    {
        temp = Arr[CountDown];
        Arr[CountDown] = Arr[CountUp];
        Arr[CountUp] = temp;
        CountDown--;
        CountUp++;
    }
}

int[] SomeArray = new int[20];

FillAndPrintArray(SomeArray);
UpsideDownArray(SomeArray);
PrintArray(SomeArray);