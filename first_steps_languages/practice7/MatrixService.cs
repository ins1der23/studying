using System;

public class MatrixService
{
    //  Создать матриццу 
    public static int[,] CreateMatrix(int i, int j)
    {
        int[,] someArray = new int[i, j];
        return someArray;
    }
    //  Создать матриццу 
    public static void FillMatrixRecurs(int[,] anyMatrix, int i = 0, int j = 0, int start = 1, int end = 100)
    {
        int rows = anyMatrix.GetLength(0);
        int columns = anyMatrix.GetLength(1);
        if (i >= rows || j >= columns) return;
        anyMatrix[i, j] = new Random().Next(start, end);
        FillMatrixRecurs(anyMatrix, i, j + 1);
        FillMatrixRecurs(anyMatrix, i + 1, j);
    }

    public static string MatrixToString(int[,] anyMatrix)
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
    // Обмен строк в матрице
    public static void ChangeLines(int[,] anyMatrix, int lineFrom, int lineTo, int temp = 0, int i = 0)
    {
        if (i >= anyMatrix.GetLength(1)) return;
        temp = anyMatrix[lineTo, i];
        anyMatrix[lineTo, i] = anyMatrix[lineFrom, i];
        anyMatrix[lineFrom, i] = temp;
        ChangeLines(anyMatrix, lineFrom, lineTo, temp, i + 1);
    }
    public static string ArrayJoinToString(int[] matrix)
    {
        return $"{String.Join(' ', matrix)}";
    }
    public static int GetIntegerForSquare(string text)
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
    public static int BoundInput(int check, string message, int bound = 0)
    {
        bool flag = true;
        flag = (check > bound);
        while (!flag)
        {
            Console.WriteLine(message);
            check = GetIntegerForSquare("Введите еще раз ");
            flag = (check > bound);
        }
        return check;
    }
    public static bool EqualCheck(int first, int second)
    {
        return first == second;
    }
    // Создание квадратной матрицы
    public static (int, int) SquareMatrixSizes(string message)
    {
        int rows = 0;
        int columns = 0;
        Console.WriteLine(message);
        do
        {
            rows = GetIntegerForSquare("Введите количество строк");
            rows = BoundInput(rows, "Количество строк не может быть меньше 1", 0);
            columns = GetIntegerForSquare("Введите количество столбцов");
            columns = BoundInput(columns, "Количество столбцов не может быть меньше 1", 0);
            if (!EqualCheck(rows, columns)) Console.WriteLine("Для замены количество строк и столбцов должно быть равным");
        } while (!EqualCheck(rows, columns));
        return (rows, columns);
    }
    // Замена строки на столбец
    public static void RowToColumnSwap(int[,] swappedMatrix, int i = 0, int j = 0)
    {
        int size = swappedMatrix.GetLength(0);
        int temp = 0;
        if (i >= size || j >= size) return;
        else
        {
            temp = swappedMatrix[i, j];
            swappedMatrix[i, j] = swappedMatrix[j, i];
            swappedMatrix[j, i] = temp;
            RowToColumnSwap(swappedMatrix, i, j + 1);
            RowToColumnSwap(swappedMatrix, i + 1, j + 1);
            return;
        }
    }
    public static int RoundHalf(int someNumber)
    {
        if (someNumber % 2 == 0) return someNumber / 2;
        else return someNumber / 2 + 1;
    }
    // тестовая функция увеличения числа на 1
    public static int StepPlusOne(int step, int number = 0)
    {
        if (step <= 0) return number;
        else
        {
            number = StepPlusOne(step - 1, number + 2);
            return number;

        }
    }
    public static void StepMatrixFilling(int[,] preparedMatrix, int i = 0, int j = 0, int n = 1)
    {
        int rows = preparedMatrix.GetLength(0);
        int columns = preparedMatrix.GetLength(1);
        if (i >= rows || j >= columns || j < 0 || i < 0 || preparedMatrix[i,j] != 0) return;
        else if (preparedMatrix[i, j] == 0)
        {
            preparedMatrix[i, j] = n;
            StepMatrixFilling(preparedMatrix, i + 1, j - 1, n + 1);
            StepMatrixFilling(preparedMatrix, i - 4, j - 5);
            StepMatrixFilling(preparedMatrix, i + 1, j + 1, n + 1);
            StepMatrixFilling(preparedMatrix, i - 4, j - 5);
            return;
        }
    }
}

   
