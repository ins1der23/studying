using System;
using System.IO;
using static Shared;

int[,] firstMatrix;
int[,] secondMatrix;
int[,] resultMatrix;
do
{
    Console.WriteLine($"Для умножения матриц количество столбцов в первой матрице должно совпадать с количеством строк во второй");
    firstMatrix = CreateMatrix("Создаем первую матрицу");
    secondMatrix = CreateMatrix("Создаем вторую матрицу");
    if (MultiplyMatrixCheck(firstMatrix, secondMatrix)) Console.WriteLine("Условие для умножения не выполняется. Создаем матрицы снова." + Environment.NewLine);
} while (MultiplyMatrixCheck(firstMatrix, secondMatrix));

FillMatrixRandom(firstMatrix, 1, 10);
Console.WriteLine(PrintMatrix(firstMatrix));
FillMatrixRandom(secondMatrix, 1, 10);
Console.WriteLine(PrintMatrix(secondMatrix));
resultMatrix = MultiplyMatrix(firstMatrix, secondMatrix);
Console.WriteLine(PrintMatrix(resultMatrix));