using System;
public class Shared
{
    public static int GetInteger(string text)
    {
        int num = 0;
        bool flag = true;
        do
        {
            Console.Write($"{text}: ");
            flag = int.TryParse(Console.ReadLine(), out num);
        } while (!flag);
        return num;
    }
    public static int BoundInput(int check, string message, int startBound = 0, int endBound = 0)
    {
        bool flag = true;
        while (!flag)
        {
            Console.WriteLine(message);
            check = GetInteger("Введите еще раз ");
            flag = (check > startBound);
        }
        return check;
    }
    public static bool EqualCheck(int first, int second)
    {
        return first == second;
    }

    public static bool PositiveCheck(int b)
    {
        return b > 0;
    }
    public static bool PositiveCheck(double b)
    {
        return b > 0;
    }
}

