using static MatrixService;
using static Shared;
using static RowToColumn;
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
        int[,] swapMatrix = CreateMatrix(sizes.Item1, sizes.Item2);
        RowToColumnSwap(someMatrix, swapMatrix);
        Console.WriteLine(MatrixToString(swapMatrix));
    }

    public static void RunPascalTriangle()
    {

    }
}




