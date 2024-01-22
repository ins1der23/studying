using static CommonMethods;

public class Controller
{

    View view;
    ICalc calc;
    readonly ParserSelecter parser;

    protected View View { get => view; set => view = value; }


    public Controller(View view)
    {
        this.view = view;
        parser = new();
        calc = new RealCalc();
    }


    public string GetNumeric()
    {
        string output = string.Empty;
        bool flag = true;
        while (flag)
        {
            output = View.GetString(View.Text.InputNum);
            if (IsNumeric(output)) flag = false;
            else View.ShowString("ОШИБКА ВВОДА");
        }
        return output;
    }

    public string GetOperation()
    {
        string output = string.Empty;
        bool flag = true;
        while (flag)
        {
            output = View.GetString("Введите операцию");
            if (IsOperation(output)) flag = false;
            else View.ShowString("ОШИБКА ВВОДА");
        }
        return output;
    }

    public void Run()
    {
        string fisrtInput = GetNumeric();
        string operation = GetOperation();
        string secondInput = GetNumeric();
        INum firstNum = parser.GetNum(fisrtInput);
        INum secondNum = parser.GetNum(secondInput);
        INum result = calc.Calculate(firstNum,operation,secondNum);
        Console.WriteLine(result);
    }




}