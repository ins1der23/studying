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

    public static bool PositiveCheck(int b)
    {
        return b >= 0;
    }
        public static bool PositiveCheck(double b)
    {
        return b >= 0;
    }
}

