void FillArrayBinary(int[] SomeArray)
{
    int size = SomeArray.Length;
    int index = 0;
    while (index < size)
    {
        SomeArray[index] = new Random().Next(0, 2);
        index++;
    }
}
int[] BinaryArray = new int[8];

void PrintArray(int[] SomeArray)
{
    int size = SomeArray.Length;
    int index = 0;
    while(index<size)
    {
        Console.Write("{0} ",SomeArray[index]);
        index++;
    }
}

FillArrayBinary(BinaryArray);
PrintArray(BinaryArray);