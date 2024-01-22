using System.Linq.Expressions;
using Domain;

class ParserSelecter
{
    INumParser<RealNum> realNumParser;
    INumParser<ComplexNum> compleNumParser;

    public ParserSelecter()
    {
        realNumParser = new RealNumParser();
        compleNumParser = new ComplexNumParser();
    }

    public INum GetNum(string input)
    {
        if (realNumParser.IsValid(input)) return realNumParser.ToNum(input);
        else if (compleNumParser.IsValid(input)) return compleNumParser.ToNum(input);
        else return null!;
    }



}



