/// <summary>
/// Класс логгера, сообщения может выводить в консоль и записывать в файл
/// </summary>
class Logger
{

    /// <summary>
    /// FileInfo для получения информации о файле лога
    /// </summary>
    private readonly FileInfo fileInfo;

    /// <summary>
    /// Путь к файлу лога
    /// </summary>
    private readonly string path;
    /// <summary>
    ///  StreamWriter для записи лога в файл
    /// </summary>
    StreamWriter sw;

    /// <summary>
    /// Свойство для получения текущего времени и даты
    /// </summary>
    private DateTime Time => DateTime.Now;



    /// <summary>
    /// Конструктор, принимающий путь к файлу
    /// </summary>
    /// <param name="path"></param>
    public Logger(string path)
    {
        fileInfo = new FileInfo(path);
        this.path = path;
        sw = new(path, false);
        sw.Close();
    }

    /// <summary>
    /// Запись системных сообщений в файл
    /// </summary>
    /// <param name="message">Текст сообщения</param>
    /// <param name="data">Данные от программы</param>
    public void Write(string message, string data = "")
    {
        if (fileInfo.Exists)
        {
            if (!data.Equals(string.Empty)) data = $": {data}";
            sw = new(path, true);
            string line = $"{Time} {message}{data}";
            sw.WriteLine(line);
            sw.Close();
        }
    }
    /// <summary>
    /// Вывод системных сообщений в консоль 
    /// </summary>
    /// <param name="message">Текст сообщения</param>
    /// <param name="data">Данные от программы</param>
    public void Alert(string message, string data = "") => Console.WriteLine($"{message} {data}");
}