using static Shared;
// Задача 61: Вывести первые N строк треугольника Паскаля. Сделать вывод в виде равнобедренного треугольника

// 17:19
// 

// Задача 2: Задайте двумерный массив. Напишите программу, которая заменяет строки на столбцы. В случае, если это невозможно, программа должна вывести сообщение для пользователя.

// Задача 3: Вывести первые N строк треугольника Паскаля. Сделать вывод в виде равнобедренного треугольника

// Задача 3*: Сохранить треугольник в файл

// Задача1: Задайте двумерный массив. Напишите программу, которая поменяет местами первую и последнюю строку массива.

int[,] someMatrix = CreateMatrix(5,6);
Console.WriteLine(MatrixToString(someMatrix));
FillMatrix(someMatrix);
Console.WriteLine(MatrixToString(someMatrix));
int[] tempLine = CreateArray(someMatrix.GetLength(1));
Console.WriteLine(ArrayJoinToString(tempLine));
ChangeLines(someMatrix,0, 4,tempLine);
Console.WriteLine(ArrayJoinToString(tempLine) + Environment.NewLine);
Console.WriteLine(MatrixToString(someMatrix));
