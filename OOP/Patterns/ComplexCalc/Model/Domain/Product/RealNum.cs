/// <summary>
/// Класс вещественного INum
/// </summary>
class RealNum : INum
{
    /// <summary>
    /// Значение INum
    /// </summary>
    private double value;
    /// <summary>
    /// Свойство, получающее округленное value
    /// </summary>
    public double Value { get => Math.Round(value, 2); }

    /// <summary>
    /// Конструктор, принимающий double на вход, по умолчанию 0 
    /// </summary>
    /// <param name="value">double переменная, по умолчанию 0</param>
    public RealNum(double value = 0)
    {
        this.value = value;
    }

    /// <summary>
    /// Метод для получения значения INum
    /// </summary>
    /// <returns>Значение INum</returns>
    public object GetValue() => value;



    public override string ToString()
    {
        return $"{Value}";
    }
}