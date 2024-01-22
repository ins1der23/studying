
class Controller
{

    private IView view;
    private readonly Text text;
    private ICalcSelecter? calc;
    private readonly Logger logger;
    private readonly ParserSelecter parser;


    protected IView View { get => view; set => view = value; }


    public Controller(View view, Text text)
    {
        logger = new();
        this.view = new ViewDecorator(view, logger);
        this.text = text;
        parser = new();
        logger = new();
    }

    public void Run()
    {
        bool flag = true;
        while (flag)
        {
            string command = View.GetString(text.Start).ToUpper();
            switch (command)
            {
                case "CALC":
                    string firstInput = View.GetNumeric(text.First, text.InputNum, text.InputError);
                    string operation = View.GetOperation(text.Operation, text.InputError);
                    string secondInput = View.GetNumeric(text.Second, text.InputNum, text.InputError);
                    string toCalc = $"{firstInput} {operation} {secondInput}";
                    View.ShowString(toCalc);
                    View.PressEnter(text.PressEnter, false);

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
                    if (result == null) View.ShowString(text.InputError);
                    else View.ShowString($"{toCalc} = {result}");
                    View.PressEnter(text.PressEnter, false);
                    break;
                case "EXIT":
                    flag = false;
                    break;
            }
        }
    }
}