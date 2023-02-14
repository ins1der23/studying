Console.WriteLine("Введите два числа, чтобы проверить является ли одно квадратом другого");
double x = double.Parse(Console.ReadLine());
double y = double.Parse(Console.ReadLine());
if (Math.Sqrt(x) == y || Math.Sqrt(y) == x)
{
    if (Math.Sqrt(x) == y)
    {
        Console.WriteLine("{0} является квадратом {1}", x, y);
    }
    if (Math.Sqrt(y) == x)
    {
        Console.WriteLine("{0} является квадратом {1}", y, x);
    }
}
else
{
    Console.WriteLine("Числа не являются квадратами друг-друга");
}

