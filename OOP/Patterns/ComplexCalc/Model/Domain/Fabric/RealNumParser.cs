/// <summary>
/// Класс для парсинга строки в RealNum
/// </summary>
class RealNumParser : INumParser<INum>
{
    /// <summary>
    /// Проверка возможности преобразование сроки в RealNum
    /// </summary>
    /// <param name="input"></param>
    /// <returns>Результат проверки</returns>
    public bool IsValid(string input) => double.TryParse(input, out double _);

    /// <summary>
    /// Преобразование  строки в RealNum
    /// </summary>
    /// <param name="checkedInput">Cтрока ввода числа</param>
    /// <returns>RealNum или null в  случае неудачи</returns>
    public INum ToNum(string input)
    {
        if (IsValid(input))
        {
            input = input.Replace('.', ',');
            _ = double.TryParse(input, out double num);
            return new RealNum(num);
        }
        return null!;
    }
}