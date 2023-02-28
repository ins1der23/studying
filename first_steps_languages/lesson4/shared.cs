public class Shared
{
    public static void PrintMatrix(int[,] anyMatrix)
    {
        for (int rows = 0; rows < anyMatrix.GetLength(0); rows++)
        {
            for (int columns = 0; columns < anyMatrix.GetLength(1); columns++)
            {
                Console.Write("{0} ", anyMatrix[rows, columns]);
            }
            Console.WriteLine();
        }
    }
    public static void FillMatrix(int[,] anyMatrix)
    {
        for (int rows = 0; rows < anyMatrix.GetLength(0); rows++)
        {
            for (int columns = 0; columns < anyMatrix.GetLength(1); columns++)
            {
                anyMatrix[rows, columns] = new Random().Next(1, 10);
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
        else return number * Factorial(number-1);
    }

    public static double Fibo(int number)
    {
        if (number==1 || number==2) return 1;
        else return Fibo(number-1)+Fibo(number-2);
    }
    
}

