class Logger
{
    LoggerText text;
    StreamWriter sw;

    public LoggerText Text { get => text; set => text = value; }
    public Logger()
    {
        text = new();
        // sw = new("log.txt");
    }



    public void Alert(string message, string data = "")
    {
        Console.WriteLine($"{message} {data}");
    }




}