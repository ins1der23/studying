class Logger
{

    private readonly FileInfo fileInfo;
    private readonly string path;
    private DateTime Time => DateTime.Now;
    StreamWriter sw;



    public Logger(string path)
    {
        fileInfo = new FileInfo(path);
        this.path = path;
        sw = new(path, false);
        sw.Close();
    }

    public void Write(string message, string data = "")
    {
        if (fileInfo.Exists)
        {
            if(!data.Equals(string.Empty)) data = $": {data}";
            sw = new(path, true);
            string line = $"{Time} {message}{data}";
            sw.WriteLine(line);
            sw.Close();
        }

    }
    public void Alert(string message, string data = "")
    {
        Console.WriteLine($"{message} {data}");
    }
}