// Дано число. Проверить кратно ли оно 7 и 23 (блок-схема, c#)

void DivisibilityTo7And23(int ver)
{
    if (ver % 7 == 0)
    {
        ver = ver / 7;
        if (ver % 23 == 0) Console.WriteLine("Число кратно 7 и 23");
        else Console.WriteLine("Число кратно 7");
    }
    else
    {
        if (ver % 23 == 0) Console.WriteLine("Число кратно 23");
        else Console.WriteLine("Число не кратно 7 и 23");
    }
}

Console.WriteLine("Введите число");
int SomeNumber = int.Parse(Console.ReadLine());
DivisibilityTo7And23(SomeNumber);