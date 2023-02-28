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

    public static int[] CreateArray(int size)
    {
        return new int[size];
    }

    public static void FillIntArrayRandom(int[] anyArray)
    {
        int bound1 = 0;
        int bound2 = 0;
        bool flag = true;
        do
        {
            bound1 = GetInteger("Введите нижнюю границу чисел в массиве");
            bound2 = GetInteger("Введите верхнюю границу чисел в массиве");
            flag = (bound2 > bound1);
            if (!flag) Console.WriteLine("Нижняя граница должна быть меньше верхней");
        } while (!flag);
        for (int i = 0; i < anyArray.Length; i++)
        {
            anyArray[i] = new Random().Next(bound1, bound2);
        }
    }

    public static string ArrayToString(int[] anyArray)
    {
        return $"[{String.Join(' ', anyArray)}]";
    }

    public static (int, int) MinMax(int[] anyArray)
    {
        int minI = 0;
        int maxI = 0;
        for (int i = 1; i < anyArray.Length; i++)
        {
            if (anyArray[i] > anyArray[maxI]) maxI = i;
            else if (anyArray[i] < anyArray[minI]) minI = i;
        }
        return (anyArray[minI], anyArray[maxI]);
    }

    public static string CounterRepeat(int[] anyArray, int minInArray, int maxInArray)
    {
        int size = maxInArray - minInArray + 1;
        int[] dictionary = new int[size];
        string output = String.Empty;
        for (int i = 0; i < anyArray.Length; i++)
        {
            dictionary[anyArray[i] - minInArray]++;
        }
        for (int i = 0; i < dictionary.Length; i++)
        {
            if (dictionary[i] != 0)
            {
                output = output + $"Число {i + minInArray} встречается {dictionary[i]} раз" + Environment.NewLine;
            }

        }
        return output;
    }

}