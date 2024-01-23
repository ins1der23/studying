/// <summary>
/// Интерфейс для классов калькуляторов
/// </summary>
interface ICalc
{
    /// <summary>
    /// Метод вычисления выражения
    /// </summary>
    /// <param name="first"> Первое число типа INum</param> 
    /// <param name="operation">Оператор</param>
    /// <param name="second">Второе число типа INum</param>
    /// <returns></returns>
    INum Calculate(INum first, string operation, INum second);

    /// <summary>
    /// Конвертация INum
    /// </summary>
    /// <param name="number">Входящий INum</param>
    /// <returns>Числовой object</returns>
    object Convert(INum number);
}