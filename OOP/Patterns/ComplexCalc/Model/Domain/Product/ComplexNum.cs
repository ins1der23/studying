using System.Numerics;

class ComplexNum : INum
{
    private readonly Complex value;
    public Complex Value => value;


    public ComplexNum(Complex value = new Complex())
    {
        this.value = value;
    }

    public override string ToString()
    {
        char module = '+';
        if (Math.Abs(Value.Imaginary) != Value.Imaginary) module = '-';
        return $"{Math.Round(Value.Real, 2)}{module}{Math.Round(Math.Abs(Value.Imaginary), 2)}i";
    }

    public object GetValue() => value;
}