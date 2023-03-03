using System;
public class Shared
{
    public static int[,] CreateMatrix(int rows, int columns)
    {
        int[,] someArray = new int[rows, columns];
        return someArray;
    }

    public static void FillMatrix(int[,] anyMatrix, int row = 0, int column = 0)
    {
        if (row >= anyMatrix.GetLength(0) || column >= anyMatrix.GetLength(1)) return;
        anyMatrix[row, column] = new Random().Next(1,99);
        FillMatrix(anyMatrix, row, column + 1);
        FillMatrix(anyMatrix, row + 1, column);
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
    public static int[] CreateArray(int size)
    {
        return new int[size];
    }

    public static void ChangeLines(int[,] anyMatrix, int lineFrom, int lineTo, int[] tempArray, int i = 0)
    {
        if (i >= tempArray.Length) return;
        tempArray[i] = anyMatrix[lineTo, i];
        anyMatrix[lineTo, i] = anyMatrix[lineFrom, i];
        anyMatrix[lineFrom,i] = tempArray[i];
        ChangeLines(anyMatrix, lineFrom, lineTo, tempArray, i + 1);
    }
    public static string ArrayJoinToString(int[] array)
    {
        return $"{String.Join(' ', array)}";
    }




}