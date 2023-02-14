using System.Collections.ObjectModel;
void FillMassive(int[] collection)
{
    int length = collection.Length;
    int index = 0;
    while(index < length)
    {
        collection[index] = new Random().Next(1,10);
        index ++;
    }
}

void PrintMassive(int[] col)
{
    int count = col.Length;
    int position = 0;
    while(position<count)
    {
        Console.Write ("{0} ",col[position]);
        position++;
    }
}

int IndexOf(int[] collection, int NumberToFind)
{
    int size = collection.Length;
    int index =0;
    int PositionToFind = -1; //выводим искомое за границу массива
    while(index<size)
    {
        if(collection[index] == NumberToFind)
        {
            PositionToFind = index;
            break;
        }
        index++;
    }
    return PositionToFind;
}


int[] massive = new int[10];

FillMassive(massive);
PrintMassive(massive);
Console.WriteLine (" ");

int FindPosition = IndexOf(massive,4);
Console.WriteLine(FindPosition);
