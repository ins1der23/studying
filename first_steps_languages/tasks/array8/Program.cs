int[] SomeArray = new int[8];
int size = SomeArray.Length;
int index =0;
while(index<size)
{
    SomeArray[index]=new Random().Next(1,10);
    Console.Write("{0} ",SomeArray[index]);
    index++;
}
