using System;
public class MatrixService
{
    public static int[,] CreateMatrix(int i, int j)
    {
        int[,] someArray = new int[i, j];
        return someArray;
    }
    public static void FillMatrixRecurs(int[,] anyMatrix, int i = 0, int j = 0)
    {
        int rows = anyMatrix.GetLength(0);
        int columns = anyMatrix.GetLength(1);
        if (i >= rows || j >= columns) return;
        anyMatrix[i, j] = new Random().Next(1, 99);
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
    public static void ChangeLines(int[,] anyMatrix, int lineFrom, int lineTo, int temp = 0, int i = 0)
    {
        if (i >= anyMatrix.GetLength(1)) return;
        temp = anyMatrix[lineTo, i];
        anyMatrix[lineTo, i] = anyMatrix[lineFrom, i];
        anyMatrix[lineFrom, i] = temp;
        ChangeLines(anyMatrix, lineFrom, lineTo, temp, i + 1);
    }
    public static string ArrayJoinToString(int[] array)
    {
        return $"{String.Join(' ', array)}";
    }




}