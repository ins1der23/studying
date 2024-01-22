using System.Runtime.CompilerServices;
using System.Numerics;
using System.Dynamic;

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
        return $"{Value.Real}{module}{Math.Abs(Value.Imaginary)}i";
    }

    public double[] ValueAsArray()
    {
        throw new NotImplementedException();
    }

    public object GetValue() => value;
}