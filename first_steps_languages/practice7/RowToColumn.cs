public class RowToColumn
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
    public static int BoundInput(int check, string message, int bound = 0)
    {
        bool flag = true;
        flag = (check > bound);
        while (!flag)
        {
            Console.WriteLine(message);
            check = GetInteger("Введите еще раз ");
            flag = (check > bound);
        }
        return check;
    }
    public static bool EqualCheck(int first, int second)
    {
        return first == second;
    }

    public static (int, int) SquareMatrixSizes(string message)
    {
        int rows = 0;
        int columns = 0;
        Console.WriteLine(message);
        do
        {
            rows = GetInteger("Введите количество строк");
            rows = BoundInput(rows, "Количество строк не может быть меньше 1", 0);
            columns = GetInteger("Введите количество столбцов");
            columns = BoundInput(columns, "Количество столбцов не может быть меньше 1", 0);
            if (!EqualCheck(rows, columns)) Console.WriteLine("Для замены количество строк и столбцов должно быть равным");
        } while (!EqualCheck(rows, columns));
        return (rows, columns);
    }

    public static void RowToColumnSwap(int[,] anyMatrix, int[,] swappedMatrix, int i = 0, int j = 0)
    {
        int size = anyMatrix.GetLength(0);
        if (i >= size || j >= size) return;
        else
        {
            swappedMatrix[i, j] = anyMatrix[j, i];
            RowToColumnSwap(anyMatrix, swappedMatrix, i, j + 1);
            RowToColumnSwap(anyMatrix, swappedMatrix, i + 1, j);
            return;
        }


    }


}

