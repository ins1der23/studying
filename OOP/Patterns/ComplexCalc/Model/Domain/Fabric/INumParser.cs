/// <summary>
/// Интерфейс INumParser
/// </summary>
/// <typeparam name="INum"></typeparam>
interface INumParser<INum>
{
    /// <summary>
    /// Проверка возможности преобразования
    /// </summary>
    /// <param name="input">Строка ввода числа</param>
    /// <returns>Результат проверки</returns>
    bool IsValid(string input);
    /// <summary>
    /// Преобразование в INum
    /// </summary>
    /// <param name="input">Строка ввода числа</param>
    /// <returns></returns>
    INum ToNum(string input);
}