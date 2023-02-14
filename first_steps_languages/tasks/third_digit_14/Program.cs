// Найти третью цифру числа или сообщить, что её нет

void ThirdDigit(int AnyNumber)
{
    if (AnyNumber < 100) Console.WriteLine("В числе меньше трех знаков, третьей цифры нет");
    else
    {
        Console.WriteLine("Сейчас я покажу третью цифру этого числа");
        while (AnyNumber > 1000)
        {
            AnyNumber = (int)((double)AnyNumber / 10);
        }
        Console.WriteLine("Третья цифра числа {0}", AnyNumber % 10);
    }
}

int SomeNumber = new Random().Next(1, 10000);
Console.WriteLine(SomeNumber);
ThirdDigit(SomeNumber);