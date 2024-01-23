using System.Numerics;

class ComplexNum : INum
{
    /// <summary>
    /// Значение INum
    /// </summary>
    private readonly Complex value;
    /// <summary>
    /// Свойство, получающее value
    /// </summary>
    public Complex Value => value;

    /// <summary>
    /// Конструктор, принимающий Complex на вход, по умолчанию 0 
    /// </summary>
    /// <param name="value">Complex переменная, по умолчанию 0</param>
    public ComplexNum(Complex value = new Complex())
    {
        this.value = value;
    }

    /// <summary>
    /// Переопреление ToString, выводит строку INum с округелнными значениями
    /// </summary>
    /// <returns></returns>
    public override string ToString()
    {
        char module = '+';
        if (Math.Abs(Value.Imaginary) != Value.Imaginary) module = '-';
        return $"{Math.Round(Value.Real, 2)}{module}{Math.Round(Math.Abs(Value.Imaginary), 2)}i";
    }

    /// <summary>
    /// Метод для получения значения INum
    /// </summary>
    /// <returns>Значение INum</returns>
    public object GetValue() => value;
}