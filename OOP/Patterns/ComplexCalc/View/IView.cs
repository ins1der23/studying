/// <summary>
///Интерфейc IView
/// </summary>
interface IView
{
    /// <summary>
    /// Получение строки от пользователя
    /// </summary>
    /// <param name="invite">Сообщение пользователю</param>
    /// <param name="clear">Очистить терминал</param>
    /// <returns>Строка, введенная пользователем</returns>
    string GetString(string invite, bool clear = true);

    /// <summary>
    /// Вывод сообщения пользователю в консоль
    /// </summary>
    /// <param name="message">Сообщение пользователю</param>
    /// <param name="clear">Очистить терминал</param>
    void ShowString(string message, bool clear = true);

    /// <summary>
    /// Пауза выполнения до нажатие Enter
    /// </summary>
    /// <param name="invite">Сообщение пользователю</param>
    /// <param name="clear">Очистить терминал</param>
    void PressEnter(string invite, bool clear = true);
}
