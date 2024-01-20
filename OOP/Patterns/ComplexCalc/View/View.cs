using System.Numerics;

public class View
{
    Text text;
    // NumParser numParser;
    public Text Text { get => text; set => text = value; }

    public View(Text text)
    {
        this.text = text;
        // numParser = new();
    }
    

    public static string GetString(string text, bool clear = true)
    {
        string output = string.Empty;
        if (clear) Console.Clear();
        Console.Write($"{text}: ");
        output += Console.ReadLine()!.Trim();
        return output;
    }
    public static void ShowString(string text, bool clear = true)
    {
        if (clear) Console.Clear();
        Console.WriteLine(text);
    }

   


}