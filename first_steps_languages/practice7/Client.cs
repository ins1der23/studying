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
        int rows = GetInteger("Введите количество строк");

        int[,] someMatrix = CreateMatrix(5, 6);




    }




}




