using System.Numerics;

class RealNum : INum
{
    private double value;
    public double Value { get => Math.Round(value, 2); set => this.value = value; }

    public RealNum(double value = 0)
    {
        this.value = value;
    }


   public object GetValue() => value;



    public override string ToString()
    {
        return $"{Value}";
    }
}