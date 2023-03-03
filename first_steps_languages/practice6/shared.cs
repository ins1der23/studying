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

    public static int RangeForNumber(int check, int bound1, int bound2, string message)
    {
        bool flag = true;
        flag = (check < bound1 || check > bound2);
        while (flag)
        {
            Console.WriteLine(message);
            check = GetInteger("Введите еще раз ");
            flag = (check < bound1 || check > bound2);
        }
        return check;
    }
    public static int[,] CreateMatrix(string message)
    {
        Console.WriteLine(message);
        int rows = GetInteger("Введите количество строк в матрице");
        rows = RangeForNumber(rows, 1, 45000, "Неверное количество строк");
        int columns = GetInteger("Введите количество столбцов в таблице");
        columns = RangeForNumber(columns, 1, 45000, "Неверное количество столбцов");
        int[,] someArray = new int[rows, columns];
        return someArray;
    }
    public static string PrintMatrix(int[,] anyMatrix)
    {
        string output = String.Empty;
        for (int rows = 0; rows < anyMatrix.GetLength(0); rows++)
        {
            for (int columns = 0; columns < anyMatrix.GetLength(1); columns++)
            {
                output = output + anyMatrix[rows, columns] + " ";
            }
            output = output + Environment.NewLine;
        }
        return output;
    }

    public static bool MultiplyMatrixCheck(int[,] firstMatrix, int[,] secondMatrix)
    {

        return firstMatrix.GetLength(1) != secondMatrix.GetLength(0);
    }

    public static void FillMatrixRandom(int[,] anyMatrix, int startBound, int endBound)
    {
        for (int rows = 0; rows < anyMatrix.GetLength(0); rows++)
        {
            for (int columns = 0; columns < anyMatrix.GetLength(1); columns++)
            {
                anyMatrix[rows, columns] = new Random().Next(startBound, endBound);
            }
        }
    }

    public static void PrintImage(int[,] anyImage)
    {
        for (int rows = 0; rows < anyImage.GetLength(0); rows++)
        {
            for (int columns = 0; columns < anyImage.GetLength(1); columns++)
            {
                if (anyImage[rows, columns] == 0) System.Console.Write(" ");
                else Console.Write("+");
            }
            Console.WriteLine();
        }
    }

    public static void FillImage(int[,] image, int row, int column)
    {
        if (image[row, column] == 0)
        {
            image[row, column] = 1;
            FillImage(image, row - 1, column);
            FillImage(image, row, column - 1);
            FillImage(image, row + 1, column);
            FillImage(image, row, column + 1);
        }

    }
    public static double Factorial(int number)
    {
        if (number == 1) return 1;
        else return number * Factorial(number - 1);
    }

    public static double Fibo(int number)
    {
        if (number == 1 || number == 2) return 1;
        else return Fibo(number - 1) + Fibo(number - 2);
    }

    public static int[,] MultiplyMatrix(int[,] firstMatrix, int[,] secondMatrix)
    {
        int[,] resultMatrix = new int[firstMatrix.GetLength(0), secondMatrix.GetLength(1)];
        System.Console.WriteLine(PrintMatrix(resultMatrix));
        for (int i = 0; i < resultMatrix.GetLength(0); i++)
        {
            for (int j = 0; j < resultMatrix.GetLength(1); j++)
            {
                for (int k = 0; k < firstMatrix.GetLength(1); k++)
                {
                    resultMatrix[i, j] += (firstMatrix[i, k] * secondMatrix[k, j]);

                }
            }
        }
        return resultMatrix;



    }





}

