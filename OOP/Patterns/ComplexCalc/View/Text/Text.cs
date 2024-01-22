class Text
{
    protected string inputNum;
    protected string start;
    protected string first;
    protected string operation;
    protected string second;
    protected string pressEnter;
    protected string inputError;




    public string InputNum => inputNum;
    public string Start => start;
    public string First => first;
    public string Operation => operation;
    public string Second => second;
    public string InputError => inputError;
    public string PressEnter => pressEnter;

    public Text()
    {
        inputNum = string.Empty;
        start = string.Empty;
        first = string.Empty;
        operation = string.Empty;
        second = string.Empty;
        pressEnter = string.Empty;
        inputError = string.Empty;
    }

}