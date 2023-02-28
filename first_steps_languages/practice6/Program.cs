using System.IO;
int SizeMatrix(string message)
{
    Console.Write(message);
    return Convert.ToInt32(Console.ReadLine());
}

int[,] CreateMatrix(int size0, int size1, int from, int to)
{
    int[,] newArray = new int[size0, size1];
    for (int i = 0; i < size0; i++)
    {
        for (int j = 0; j < size1; j++)
        {
            newArray[i, j] = new Random().Next(from, to);
        }
    }
    return newArray;
}

void ShowMatrix(int[,] matrix1)
{
    Console.WriteLine("Матрица: ");
    for (int i = 0; i < matrix1.GetLength(0); i++)  // Вывод первой матрицы.
    {
        for (int j = 0; j < matrix1.GetLength(1); j++)
        {
            Console.Write($"{matrix1[i, j]} ");
        }
        Console.WriteLine();
    }
}

int lines = SizeMatrix("Введите кол-во строчек матрицы: ");
int columns = SizeMatrix("Введите кол-во столбцов матрицы: ");
int from = SizeMatrix("Введите случайноe значение от: ");
int to = SizeMatrix("Введите случайноe значение до: ");

int[,] matrix1 = CreateMatrix(lines, columns, from, to);
int[,] matrix2 = CreateMatrix(lines, columns, from, to);

ShowMatrix(matrix1);
ShowMatrix(matrix2);


// 4. Функция умноженя матриц.
// 1mat 2mat
// (x w)(5 6) = (x * 5 + w * 7     x * 6 + w * 8 )
// (y z) (7 8) = (y * 5 + z * 7     y * 6 + z * 8 )

int[,] MatrixsResult(int[,] matrix1, int[,] matrix2)
{
    int [,] result = new int [matrix1.GetLength(0), matrix1.GetLength(1)];

    for (int i = 0; i < matrix1.GetLength(0); i++)
    {
        for (int j = 0; j < matrix2.GetLength(1); j++)
        {
            for (int k = 0; k < matrix2.GetLength(0); k++)
            {
                result[i, j] += matrix1[i, k] * matrix2[k, j];
            }
            Console.Write(result[i, j] + ", ");
        }
        Console.WriteLine();
    }

    return result;
}

Console.WriteLine("Результат умножения матриц: ");
MatrixsResult(matrix1, matrix2);

using StreamWriter sw = new StreamWriter("matrix2.csv");
sw.Write("11;");
sw.Write("12;");
sw.WriteLine("13;");

sw.Write("21;");
sw.Write("22;");
sw.WriteLine("23;");

using StreamReader sr = new StreamReader("matrix2.csv.txt");

while (!sr.EndOfStream)
{
  string[] s = sr.ReadLine().Split(new char[] { ';' }, StringSplitOptions.RemoveEmptyEntries);
  for (int i = 0; i < s.Length; i++)
  {
    System.Console.Write(" >>" + s[i] + "<< ");
  }
  System.Console.WriteLine();
}