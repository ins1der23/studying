using System.Numerics;
/// <summary>
/// Класс калькулятор для операций с комплесными числами
/// </summary>
class ComplexCalc : ICalc
{
    public ComplexCalc()
    {
    }

    public INum Calculate(INum first, string operation, INum second)
    {
        Complex fComplex = (Complex)Convert(first);
        Complex sComplex = (Complex)Convert(second);
        bool isPossible = true;
        if (sComplex == 0 && operation.Equals("/")) isPossible = false;
        if (!isPossible) return null!;
        ComplexNum result = new();
        if (operation.Equals("+")) result = new(fComplex + sComplex);
        if (operation.Equals("-")) result = new(fComplex - sComplex);
        if (operation.Equals("*")) result = new(fComplex * sComplex);
        if (operation.Equals("/")) result = new(fComplex / sComplex);
        return result;
    }

    public object Convert(INum number)
    {
        if (number.GetValue() is double v)
            return new Complex(v, 0);
        return (Complex)number.GetValue();
    }

}