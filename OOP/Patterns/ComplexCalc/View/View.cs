/// <summary>
/// Класс, отвечающий за консольный UI
/// </summary>
class View : IView
{

    /// <summary>
    /// Получение строки от пользователя
    /// </summary>
    /// <param name="invite">Сообщение пользователю</param>
    /// <param name="clear">Очистить терминал</param>
    /// <returns>Строка, введенная пользователем</returns>
    public string GetString(string invite, bool clear = true)
    {
        string output = string.Empty;
        if (clear) Console.Clear();
        Console.Write($"{invite}: ");
        output += Console.ReadLine()!.Trim();
        return output;
    }

    /// <summary>
    /// Вывод сообщения пользователю в консоль
    /// </summary>
    /// <param name="message">Сообщение пользователю</param>
    /// <param name="clear">Очистить терминал</param>
    public void ShowString(string message, bool clear = true)
    {
        if (clear) Console.Clear();
        Console.WriteLine(message);
    }

    /// <summary>
    /// Пауза выполнения до нажатие Enter
    /// </summary>
    /// <param name="invite">Сообщение пользователю</param>
    /// <param name="clear">Очистить терминал</param>
    public void PressEnter(string message, bool clear = true)
    {
        ShowString(message, clear);
        Console.ReadLine();
    }
}