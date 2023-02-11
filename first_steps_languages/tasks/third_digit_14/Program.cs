Random rnd = new Random();
int x = rnd.Next(1,999);
Console.WriteLine(x);
if (x < 100)
{
Console.WriteLine("В числе меньше трех знаков, третьей цифры нет");
}
else
        {
            Console.WriteLine("Сейчас я покажу третью цифру этого числа");
        }
        while (x > 1000)
        {
            x = (int) ((double) x / 10);
        }
        Console.WriteLine(x % 10);