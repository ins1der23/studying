//  Показать числа от 1 до N

string EvenNumbers(int N)
{
    string output = "";
    int index = 2;
    while (index <= N)
    {
        output = output + index + " ";
        index = index + 2;
    }
    return output;
}

int Getnumber(string text)
{
    Console.Write(text);
    return int.Parse(Console.ReadLine());
}

int N = Getnumber("Введите число "); 
string result = (EvenNumbers(N));
Console.WriteLine(result);
File.WriteAllText("file.txt", result);