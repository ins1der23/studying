/// <summary>
/// /// Класс калькулятор для операций только с вещественными числами
/// </summary>
class RealCalc : ICalc
{
    public RealCalc()
    {
    }

    public INum Calculate(INum first, string operation, INum second)
    {
        bool isPossible = true;
        if ((double)second.GetValue() == 0 && operation.Equals("/")) isPossible = false;
        if (!isPossible) return null!;
        RealNum result = new();
        if (operation.Equals("+")) result = new((double)first.GetValue() + (double)second.GetValue());
        if (operation.Equals("-")) result = new((double)first.GetValue() - (double)second.GetValue());
        if (operation.Equals("*")) result = new((double)first.GetValue() * (double)second.GetValue());
        if (operation.Equals("/")) result = new((double)first.GetValue() / (double)second.GetValue());
        return result;
    }
}