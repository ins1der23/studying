void FillOutArrayBinary(int[] SomeArray)
{
    int size = SomeArray.Length;
    int index = 0;
    while (index < size)
    {
        SomeArray[index] = new Random().Next(0, 2);
        Console.Write("{0} ", SomeArray[index]);
        index++;
    }
        Console.WriteLine(" ");
}
int[] BinaryArray = new int[8];

FillOutArrayBinary(BinaryArray);
