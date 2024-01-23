using static ControllerMethods;
class Controller
{

    private IView view;
    private readonly UiText text;
    private ICalcSelecter? calc;
    private readonly Logger logger;
    private readonly ParserSelecter parser;



    public Controller(View view, UiText text)
    {
        logger = new("log.txt");
        parser = new();
        this.view = new ViewDecorator(view, logger);
        this.text = text;
    }

    public void Run()
    {
        bool flag = true;
        while (flag)
        {
            string command = view.GetString(text.Start).ToUpper();
            switch (command)
            {
                case "CALC":
                    string firstInput = GetNumeric(text.First, text.InputNum, text.InputError);
                    string operation = GetOperation(text.Operation, text.InputError);
                    string secondInput = GetNumeric(text.Second, text.InputNum, text.InputError);
                    string toCalc = $"{firstInput} {operation} {secondInput}";
                    view.ShowString(toCalc);
                    view.PressEnter(text.PressEnter, false);

                    INum firstNum = parser.GetNum(firstInput);
                    //
                    Console.WriteLine(firstNum);
                    Console.WriteLine(firstNum is ComplexNum);
                    //
                    INum secondNum = parser.GetNum(secondInput);
                    //
                    Console.WriteLine(secondNum);
                    Console.WriteLine(secondNum is ComplexNum);
                    //
                    calc = new CalcDecorator(new CalcSelecter(firstNum, operation, secondNum), logger);
                    INum result = calc.Calculate();
                    if (result == null) view.ShowString(text.ZeroError);
                    else view.ShowString($"{toCalc} = {result}");
                    view.PressEnter(text.PressEnter, false);
                    break;
                case "EXIT":
                    flag = false;
                    break;
            }
        }
    }
    public string GetNumeric(string message, string inputNum, string inputError, bool clear = true)
    {
        view.ShowString(message, clear);
        string output = string.Empty;
        bool flag = true;
        while (flag)
        {
            output = view.GetString(inputNum, clear: false);
            if (IsNumeric(output)) flag = false;
            else view.ShowString(inputError);
        }
        return output;
    }
    public string GetOperation(string message, string inputError, bool clear = true)
    {
        string output = string.Empty;
        bool flag = true;
        while (flag)
        {
            output = view.GetString(message);
            if (IsOperation(output)) flag = false;
            else view.ShowString(inputError, clear);
        }
        return output;
    }
}