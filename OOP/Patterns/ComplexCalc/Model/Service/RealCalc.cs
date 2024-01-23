using System.Numerics;

/// <summary>
/// /// Класс калькулятор для операций только с вещественными числами
/// </summary>
class RealCalc : ICalc
{
    public INum Calculate(INum first, string operation, INum second)
    {
        double fDouble = (double)Convert(first);
        double sDouble = (double)Convert(second);
        bool isPossible = true;
        if ((double)second.GetValue() == 0 && operation.Equals("/")) isPossible = false;
        if (!isPossible) return null!;
        RealNum result = new();
        if (operation.Equals("+")) result = new(fDouble + sDouble);
        if (operation.Equals("-")) result = new(fDouble - sDouble);
        if (operation.Equals("*")) result = new(fDouble * sDouble);
        if (operation.Equals("/")) result = new(fDouble / sDouble);
        return result;
    }

    /// <summary>
    /// Конвертация INum в double
    /// </summary>
    /// <param name="number">Входящее INum</param>
    /// <returns>double число</returns>
    public object Convert(INum number)
    {
        if (number.GetValue() is Complex v)
            return v.Real;
        return (double)number.GetValue();
    }
}