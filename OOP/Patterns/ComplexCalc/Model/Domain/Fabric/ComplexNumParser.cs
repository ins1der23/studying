
using System.Numerics;
using Domain;

class ComplexNumParser : INumParser<ComplexNum>

{
    public ComplexNumParser()
    {
    }

    //проверяет, является ли введенная строка комплексным числом числом
    public  bool IsValid(string input)
    {
        string[] temp = input.Split("");
        bool result = double.TryParse(temp[0], out _);
        if (!result) return result;
        result = double.TryParse(temp[2], out _);
        return result;
    }

    //принимает на вход проверенную строку 
    public  ComplexNum ToNum(string checkedInput)
    {
        if (checkedInput.EndsWith("i")) checkedInput = checkedInput[..^1];
        _ = double.TryParse(checkedInput.First().ToString(), out double first);
        _ = double.TryParse(checkedInput.Last().ToString(), out double second);
        return new ComplexNum(new Complex(first, second));
    }

}
