Random rnd = new Random();
int x = rnd.Next(1,9999);
Console.WriteLine(x);
if (x % 7 == 0)
{
    x = x / 7;
    if (x % 23 == 0)
    {
        Console.WriteLine("Число кратно 7 и 23");
    }
    else
    {
        Console.WriteLine("Число кратно 7");
    }
}
else
{
    if (x % 23 == 0)
    {
        Console.WriteLine("Число кратно 23");
    }
    else
    {
        Console.WriteLine("Число не кратно 7 и 23");
    }
}