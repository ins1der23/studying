Console.WriteLine("Введите номер четверти");
int QuarterNumber=int.Parse(Console.ReadLine());
Random rnd = new Random();
int X = rnd.Next(1,10);
int Y = rnd.Next(1,10);
while(QuarterNumber<1 || QuarterNumber>4)
{
    Console.WriteLine("Нужно число от 1 до 4");
    QuarterNumber=int.Parse(Console.ReadLine());
}
if(QuarterNumber==1)
{
    Console.WriteLine("Диапазон по X - от 0 до {0}",X);
    Console.WriteLine("Диапазон по Y - от 0 до {0}",Y);
}
if(QuarterNumber==2)
{
    Console.WriteLine("Диапазон по X - от 0 до {0}",-X);
    Console.WriteLine("Диапазон по Y - от 0 до {0}",Y);
}
if(QuarterNumber==3)
{
    Console.WriteLine("Диапазон по X - от 0 до {0}",-X);
    Console.WriteLine("Диапазон по Y - от 0 до {0}",-Y);
}
if(QuarterNumber==4)
{
    Console.WriteLine("Диапазон по X - от 0 до {0}",X);
    Console.WriteLine("Диапазон по Y - от 0 до {0}",-Y);
}