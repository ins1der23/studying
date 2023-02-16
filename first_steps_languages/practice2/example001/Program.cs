bool Check(int AnyNumber)
{
    return AnyNumber % 7 == 0 && AnyNumber % 23 == 0;
}
Console.WriteLine("Введите число для проверки на делиость на 7 и 23 одновременно");
Console.Write("X = ");
int SomeNumber = int.Parse(Console.ReadLine());
if (Check(SomeNumber)) Console.WriteLine("Делится");
else Console.WriteLine("Не делится");
