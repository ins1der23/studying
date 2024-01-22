using System.Numerics;

class ComplexCalc : ICalc
{

    public ComplexCalc()
    {
    }
    
    public INum Calculate(INum first, string operation, INum second)
    {
        bool isPossible = true;
        if ((Complex)second.GetValue() == 0 && operation.Equals("/")) isPossible = false;
        if (!isPossible) return null!;
        ComplexNum result = new();
        if (operation.Equals("+")) result = new((Complex)first.GetValue() + (Complex)second.GetValue());
        if (operation.Equals("-")) result = new((Complex)first.GetValue() - (Complex)second.GetValue());
        if (operation.Equals("*")) result = new((Complex)first.GetValue() * (Complex)second.GetValue());
        if (operation.Equals("/")) result = new((Complex)first.GetValue() / (Complex)second.GetValue());
        return result;
    }
}