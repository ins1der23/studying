int GetInteger(string text)
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
int RangeForNumber(int check, string message, int startBound, int endBound)
{
    bool flag = true;
    flag = (check >= startBound && check <= endBound);
    while (!flag)
    {
        Console.WriteLine(message);
        check = GetInteger("Введите еще раз ");
        flag = (check >= startBound && check <= endBound);
    }
    return check;
}


Console.WriteLine("Мы можем решить три задачи");
int choice = GetInteger("Введите номер задачи");
choice = RangeForNumber(choice, "У нас три задачи, введите число от одного до трех", 1, 3);

if (choice == 1) Client.RunSwapLines();
else if (choice == 2) Client.RunColumnToRow();
else Client.RunPascalTriangle();
