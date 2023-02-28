public class Shared
{
    // Проверка на квадрат числа
    public static bool SquareCheck(double first, double second)
    {
        return (Math.Sqrt(first) == second);
    }

    // Проверка на четность
    public static bool EvenCheck(int toCheck)
    {
        return (toCheck % 2 == 0);
    }


    // Большее и меньшее число
    public static string MoreCheck(double first, double second)
    {
        string output = String.Empty;
        if (first > second) output = output + first + " больше чем " + second;
        else
        {
            if (first == second) output = output + "Числа равны";
            else output = output + second + " больше чем " + first;
        }
        return output;
    }

    // Число из диапазона для ручного ввода
    public static int RangeForNumber(int check, int bound1, int bound2, string message)
    {
        bool flag = true;
        flag = (check < bound1 || check > bound2);
        while (flag)
        {
            Console.WriteLine(message);
            check = GetInteger("Введите еще раз ");
        }
        return check;
    }

    // Возврат int числа
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
    // Возврат double числа
    public static double GetDouble(string text)
    {
        double num = 0;
        bool flag = true;
        do
        {
            Console.Write($"{text}: ");
            flag = double.TryParse(Console.ReadLine(), out num);
        } while (!flag);
        return num;
    }
    // Создание dbl массива
    public static double[] CreateDblArray(int size)
    {
        return new double[size];
    }
    // Создание str массива
    public static string[] CreateStrArray(int size)
    {
        return new string[size];
    }
    // Создание int массива
    public static int[] CreateIntArray(int size)
    {
        return new int[size];
    }

    // Заполнение массива случайными числами  и возврат значений
    public static string FillArrayRandom(int[] someArray, int bound1, int bound2)
    {
        string output = String.Empty;
        for (int i = 0; i < someArray.Length; i++)
        {
            someArray[i] = new Random().Next(bound1, bound2);
            output = output + someArray[i] + " ";
        }
        return output;
    }

    // Max число из массива

    public static int Max(int[] anyArray)
    {
        int max = 0;
        for (int i = 0; i < anyArray.Length; i++)
        {
            if (anyArray[i] > anyArray[max]) max = i;
        }
        return anyArray[max];
    }
    // Оформление string
    public static string Task(string message)
    {
        string output = String.Empty;
        return output + Environment.NewLine + message.ToUpper() + ".";
    }

    // Случайное из массива
    public static int RandomFromArray(int[] anyArray)
    {
        return anyArray[new Random().Next(0, anyArray.Length)];
    }

    // Числа от N до -N
    public static string ToMinusN(int number)
    {
        string output = String.Empty;
        if (number > 0)
        {
            for (int i = (-number); i <= (number); i++)
            {
                output = output + i + " ";
            }
        }
        else
        {
            for (int i = (-number); i >= number; i--)
            {
                output = output + i + " ";
            }
        }

        return output;
    }

    // Четные числа от 1 до N

    public static string EvenToN(int number)
    {
        string output = String.Empty;
        if (number > 1)
            for (int i = 2; i <= number; i = i + 2)
            {
                output = output + i + " ";
            }
        else
        {
            for (int i = 0; i >= number; i = i - 2)
            {
                output = output + i + " ";
            }
        }
        return output;
    }

    // Третья цифра числа
    public static int ThirdDigit(int number)
    {
        return number % 10;
    }

    // Вторая цифра числа

    public static int SecondDigit(int number)
    {
        return (number / 10) % 10;
    }

    // Удалить вторую цифру трёхзначного числа 

    public static int DeleteSecondDigit(int number)
    {
        return number / 100 + number % 10;
    }
}







