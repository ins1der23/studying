using System;
using static MatrixService;
using static Shared;
public static class Client
{
    public static void RunSwapLines()
    {
        int[,] someMatrix = CreateMatrix(5, 6);
        Console.WriteLine(MatrixToString(someMatrix));
        FillMatrixRecurs(someMatrix);
        Console.WriteLine(MatrixToString(someMatrix));
        ChangeLines(someMatrix, 0, 4);
        Console.WriteLine(MatrixToString(someMatrix));
    }

    public static void RunColumnToRow()
    {
        var sizes = SquareMatrixSizes("Задайте размеры таблицы для замены строк на столбцы");
        int[,] someMatrix = CreateMatrix(sizes.Item1, sizes.Item2);
        FillMatrixRecurs(someMatrix);
        Console.WriteLine(MatrixToString(someMatrix));
        RowToColumnSwap(someMatrix);
        Console.WriteLine(MatrixToString(someMatrix));
    }

    public static void RunPascalTriangle()
    {
        int rows = GetInteger("Введите количество строк треуольника Паскаля");
        int columns = rows * 2 - 1;
        int[,] someMatrix = CreateMatrix(rows, columns);
        Console.WriteLine(MatrixToString(someMatrix));
        int startJ = RoundHalf(columns) - 1;
        int startI = rows -1;
        // Console.WriteLine(startJ);
        StepMatrixFilling(someMatrix, 0, startJ);
        Console.WriteLine(MatrixToString(someMatrix));
    }
}




