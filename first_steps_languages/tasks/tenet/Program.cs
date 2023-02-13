int CustomNumber = int.Parse(Console.ReadLine());
while (CustomNumber < 9999 || CustomNumber > 100000)
{
    CustomNumber = int.Parse(Console.ReadLine());
}
if (CustomNumber / 10000 == CustomNumber % 10)
{
    CustomNumber = CustomNumber / 10;
    if ((CustomNumber / 100) - 10 == CustomNumber % 10)
    {
        Console.WriteLine("YES, WE'VE GOT IT");
    }
    else
    {
        Console.WriteLine("DAMN, WE WERE SO CLOSE");
    }
}
else
{
    Console.WriteLine("NO MAN");
}