int n = 8;
while (n > 7 || n<1)
{
Console.WriteLine("Введите номер дня недели и я опрелю выходный ли это");
n = int.Parse(Console.ReadLine());
Console.WriteLine("Не является днем недели");
}
    if (n > 0 && n < 8)
    {
        if (n == 6 || n == 7)
        {
            Console.WriteLine("Выходной");
        }
        else
        {
            Console.WriteLine("Будний день");
        }
    }
    
