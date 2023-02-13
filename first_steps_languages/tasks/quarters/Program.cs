double coordX = double.Parse(Console.ReadLine());
double coordY = double.Parse(Console.ReadLine());
if (coordX > 0)
{
    if (coordY > 0)
    {
        Console.WriteLine("I");
    }
    else
    {
        Console.WriteLine("IV");
    }
}
else
{
    if (coordY > 0)
    {
        Console.WriteLine("II");
    }
    else
    {
        Console.WriteLine("III");
    }
}
