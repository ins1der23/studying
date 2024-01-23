/// <summary>
/// Класс для системных сообщений
/// </summary>
class LoggerText
{
    private readonly string numberGot;
    private readonly string operationGot;
    private readonly string stringGot;
    private readonly string awaitContinue;
    private readonly string stringShown;
    private readonly string calcStart;
    private readonly string resultGot;
    private readonly string inputError;
    private readonly string zeroError;

    public string NumberGot => numberGot;
    public string OperationGot => operationGot;
    public string StringGot => stringGot;
    public string AwaitContinue => awaitContinue;
    public string StringShown => stringShown;
    public string CalcStart => calcStart;
    public string ResultGot => resultGot;
    public string InputError => inputError;
    public string ZeroError => zeroError;

    /// <summary>
    /// Конструктор, устанавливающиий текст системных сообщений
    /// </summary>
    public LoggerText()
    {
        {
            numberGot = "Пользователь ввел число";
            operationGot = "Пользователь ввел операцию";
            stringGot = "Пользователь ввел строку";
            awaitContinue = "Ожидаем продолжения";
            stringShown = "Показываем пользователю строку";
            calcStart = "Вызываем калькулятор";
            resultGot = "Пользователь получил резльтат";
            inputError = "Пользователь получил ошибку ввода";
            zeroError = "Пользователь получил ошибку деления на ноль";
        }
    }


}