using Domain;

class RealNumParser : INumParser<INum>
{
    public RealNumParser()
    {
    }
    public  bool IsValid(string input) => double.TryParse(input, out double _);

    public  INum ToNum(string checkedInput)
    {
        _ = double.TryParse(checkedInput, out double num);
        return new RealNum(num);
    }
 }