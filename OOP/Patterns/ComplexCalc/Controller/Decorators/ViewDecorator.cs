/// <summary>
/// Класс, объединяющий Logger и View 
/// </summary>
class ViewDecorator : IView
{   
    /// <summary>
    /// Переменная для логгера
    /// </summary>
    private readonly Logger logger;

    /// <summary>
    /// Текст логгера
    /// </summary>
    readonly LoggerText loggerText;

    /// <summary>
    /// View, с которым нужно объедтнить логгер
    /// </summary>
    private readonly IView oldView;


    /// <summary>
    /// Конструткор ViewDecorator
    /// </summary>
    /// <param name="oldView">Передаваемый View, с которым нужно объеденить логгер</param>
    /// <param name="logger">Переменная для логгера</param>
    public ViewDecorator(IView oldView, Logger logger)
    {
        this.oldView = oldView;
        this.logger = logger;
        loggerText = new();
    }
    /// <summary>
    /// Получение строки от пользовтеля с записью результата в лог
    /// </summary>
    /// <param name="invite">Сообщение пользователю</param>
    /// <param name="clear">Очистить терминал</param>
    /// <returns>Строка, введенная пользователем</returns>
    public string GetString(string invite, bool clear = false)
    {
        string output = oldView.GetString(invite, clear);
        logger.Write(loggerText.StringGot, output);
        return output;
    }
    /// <summary>
    /// Пауза выполнения до нажатие Enter с записью в лог
    /// </summary>
    /// <param name="invite">Сообщение пользователю</param>
    /// <param name="clear">Очистить терминал</param>
    public void PressEnter(string invite, bool clear = false)
    {
        logger.Write(loggerText.AwaitContinue);
        oldView.PressEnter(invite, clear);
    }
    /// <summary>
    /// Вывод сообщения пользователю в консоль с записью в лог
    /// </summary>
    /// <param name="message">Сообщение пользователю</param>
    /// <param name="clear">Очистить терминал</param>
    public void ShowString(string message, bool clear = false)
    {
        logger.Write(loggerText.StringShown, message);
        oldView.ShowString(message, clear);
    }

}