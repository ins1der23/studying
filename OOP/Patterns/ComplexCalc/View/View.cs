using static CommonMethods;
class View : IView
{


    public View()
    {


    }
    public string GetString(string text, bool clear = true)
    {
        string output = string.Empty;
        if (clear) Console.Clear();
        Console.Write($"{text}: ");
        output += Console.ReadLine()!.Trim();
        return output;
    }
    public void ShowString(string text, bool clear = true)
    {
        if (clear) Console.Clear();
        Console.WriteLine(text);
    }
    public void PressEnter(string message, bool clear= true)
    {
        ShowString(message, clear);
        Console.ReadLine();
    }

    public string GetNumeric(string message, string inputNum, string inputError,bool clear = true)
    {

        ShowString(message, clear);
        string output = string.Empty;
        bool flag = true;
        while (flag)
        {
            output = GetString(inputNum, clear: false);
            if (IsNumeric(output)) flag = false;
            else ShowString(inputError);
        }
        return output;
    }
    public string GetOperation(string message, string inputError, bool clear = true)
    {
        string output = string.Empty;
        bool flag = true;
        while (flag)
        {
            output = GetString(message);
            if (IsOperation(output)) flag = false;
            else ShowString(inputError, clear);
        }
        return output;
    }






}