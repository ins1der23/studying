void FillMassiveTen(int[] SomeArray)
{
    int size = SomeArray.Length;
    int index = 0;
    while (index < size)
    {
        SomeArray[index] = new Random().Next(-9, 10);
        Console.Write("{0} ", SomeArray[index]);
        index++;
    }
    Console.WriteLine(" ");
}
int[] NextArray = new int[12];
FillMassiveTen(NextArray);
int size = NextArray.Length;
int index = 0;
int PositiveSum = 0;
int NegativeSum = 0;
while (index < size)
{
    if (NextArray[index] > 0) PositiveSum = PositiveSum + NextArray[index];
    else NegativeSum = NegativeSum + NextArray[index];
    index++;
}
Console.WriteLine("Сумма положительных = {0}", PositiveSum);
Console.WriteLine("Сумма отрицательных ={0}", NegativeSum);