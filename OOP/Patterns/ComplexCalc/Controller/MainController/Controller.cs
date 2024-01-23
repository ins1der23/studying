using static ControllerMethods;
/// <summary>
/// Класс Controller
/// </summary>
class Controller
{

    /// <summary>
    /// коснольный view
    /// </summary>
    private IView view;

    /// <summary>
    /// Перемнная для текста UI
    /// </summary>
    private readonly UiText text;

    /// <summary>
    /// Переменная для выбора модели ICalc
    /// </summary>
    private ICalcSelecter? calc;
    /// <summary>
    /// Логгер
    /// </summary>
    private readonly Logger logger;
    /// <summary>
    /// Переменная для выбора модели парсера
    /// </summary>
    private readonly ParserSelecter parser;



    /// <summary>
    /// Конструктор, принимает на вход View и текст интерфейса
    /// </summary>
    /// <param name="view"></param>
    /// <param name="text"></param>
    public Controller(View view, UiText text)
    {
        logger = new("log.txt");
        parser = new();
        this.view = new ViewDecorator(view, logger);
        this.text = text;
    }

    /// <summary>
    /// Запуск программы
    /// </summary>
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
                    INum secondNum = parser.GetNum(secondInput);
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
    /// <summary>
    /// Вспомоательный метод получения строки с числовым значением
    /// </summary>
    /// <param name="message"></param>
    /// <param name="inputNum"></param>
    /// <param name="inputError"></param>
    /// <param name="clear"></param>
    /// <returns></returns>
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
    /// <summary>
    /// Вспомоательный метод получения оператора вычисления
    /// </summary>
    /// <param name="message"></param>
    /// <param name="inputNum"></param>
    /// <param name="inputError"></param>
    /// <param name="clear"></param>
    /// <returns></returns>
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