int GetInteger()
{
    int num = 0;
    bool flag = true;
    do
    {
        flag = int.TryParse(Console.ReadLine(), out num);
    } while (!flag);
    return num;
}
int n = 5; // количество элементов в массиве
int[] array = new int[n];
for (int i = 0; i < n; i++) array[i] = new Random().Next(1,10);
Console.WriteLine(String.Join(" ", array));
Console.WriteLine(array[3]); // сложность алгоритма, одно действие О(1)

int sum = 0;                    // [5,4,3,1,2] найти сумму  - сложность O(n)
for (int i = 0; i < array.Length; i++) sum += array[1];
Console.WriteLine(sum);
// [1,2,3,4,5] сначала отсоритируем QSort - O(n*log n)
//  найдем сумму арифметической прогресии ((5+1) / 2) * 5, одна операция - O(1)
// но не всегда  n < n*log(n) + 1 => найти сумму перебором эффективнее  

int m = GetInteger();               // таблица умножения сложность О(n^2)
for (int i = 1; i <= m; i++)
{
    for (int j = 1; j <= m; j++)
    {
        Console.Write(i * j + "\t");
    }
    Console.WriteLine();
}

int o = GetInteger();            // таблица умножения через заполнение половин сложность О(n^2 / 2)
int[,] matrix = new int[o, o];
for (int i = 0; i < o; i++)
{
    for (int j = i; j <= m; j++)
    {
        matrix[i, j] = (i + 1) * (j + 1);
        matrix[j, i] = matrix[i, j];
    }
    Console.WriteLine();
}

for (int i = 0; i < o; i++)
{
    for (int j = 0; j < o; j++)
    {
        Console.Write(matrix[i,j] + " ");
    }
    Console.WriteLine();
}