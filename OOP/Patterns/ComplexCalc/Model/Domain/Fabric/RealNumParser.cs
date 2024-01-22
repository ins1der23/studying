using Domain;

class RealNumParser : INumParser<RealNum>
{
    public RealNumParser()
    {
    }
    public  bool IsValid(string input) => double.TryParse(input, out double _);

    public  RealNum ToNum(string checkedInput)
    {
        _ = double.TryParse(checkedInput, out double num);
        return new RealNum(num);
    }
 }