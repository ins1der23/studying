using System.Numerics;

class RealNum : AbstractNum
{
    private readonly double someNum;
    public RealNum(double someNum)
    {
        this.someNum = someNum;
    }

    
    public void GetValue() => Math.Round(someNum, 2);

    public override AbstractNum ToNum(string checkedInput)
    {
        
    }
}