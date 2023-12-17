
Setters.numResetter = true;
Console.WriteLine(Setters.numResetter);
Setters.toReset();
Console.WriteLine(Setters.numResetter);

Agreement[] someAgreements = new Agreement[10];
for (int i = 0; i < 10; i++)
{
    someAgreements[i] = new Agreement();
}
foreach (var item in someAgreements)
{
    Console.WriteLine(item.Num);
}

static class Setters
{
    public static int someInt = 1;
    public static bool numResetter;

    public static void toReset()
    {
        int someInt = 1;
        if (someInt > 25) numResetter = true;
    }

}



class Agreement
{
    public static DateTime Date { get; set; } = DateTime.Today;
    public string Num { get; set; }
    static int nextNum = ResetNum(nextNum);

    public Agreement()
    {
        Num = $"{Date.Month} - {Interlocked.Increment(ref nextNum)}";
    }
    private static int ResetNum(int id)
    {
        int res = id;
        if (Setters.someInt < 13 && Setters.numResetter) res = 0;
        else res = 100;
        return res;
    }

}







