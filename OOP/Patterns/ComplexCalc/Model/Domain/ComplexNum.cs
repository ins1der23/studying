using System.Runtime.CompilerServices;
using System.Numerics;
using System.Dynamic;

class ComplexNum : AbstractNum
{
    private readonly Complex someNum;
    public ComplexNum(Complex someNum)
    {
        this.someNum = someNum;
    }

    public override AbstractNum ToNum(string checkedInput)
    {
        string[] temp = checkedInput.Split("");
        _ = double.TryParse(temp[0], out double first);
        _ = double.TryParse(temp[2], out double second);
        return new ComplexNum(new Complex(first, second));
    }

    public override string ToString()
    {
        return $"{someNum.Real}{someNum.Magnitude}{someNum.Imaginary}i";
    }
}