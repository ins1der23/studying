
using System.Numerics;
using Domain;

class ComplexNumParser : INumParser<INum>

{
    /// <summary>
    /// Пустой конструктор
    /// </summary>
    public ComplexNumParser()
    {
    }

    /// <summary>
    /// Проверяет, является ли введенная строка комплексным числом
    /// </summary>
    /// <param name="input"></param>
    /// <returns></returns>
    public bool IsValid(string input)
    {
        if (!input.Contains('i')) return false;
        if (input.StartsWith("-")) input = input[1..];
        if (!input.Contains('-') && !input.Contains('+')) return false;
        return true;
    }

    /// <summary>
    /// Конвертирует в INum проверенную строку 
    /// </summary>
    /// <param name="checkedInput"></param>
    /// <returns>ComplexNum</returns>
    public INum ToNum(string checkedInput)
    {
        checkedInput = checkedInput.Replace('.', ',');
        checkedInput = checkedInput[..^1];
        string module = string.Empty;
        if (checkedInput.StartsWith('-'))
        {
            module = "-";
            checkedInput = checkedInput[1..];
        }
        int index = 0;
        if (checkedInput.Contains('-')) index = checkedInput.IndexOf('-');
        if (checkedInput.Contains('+')) index = checkedInput.IndexOf('+');
        string first = checkedInput[..index];
        first = module + first;
        module = string.Empty;
        string second = string.Empty;

        if (!checkedInput.Contains('+'))
        {
            if (checkedInput.Count(x => x.ToString().Equals("-")) == 2)
                second = checkedInput[(index + 2)..];
            if (checkedInput.Count(x => x.ToString().Equals("-")) == 1)
            {
                module = "-";
                second = checkedInput[(index + 1)..];
            }
        }
        else
        {
            second = checkedInput[(index + 1)..];
        };
        second = module + second;
        _ = double.TryParse(first, out double real);
        _ = double.TryParse(second, out double imaginary);
        return new ComplexNum(new Complex(real, imaginary));
    }
}
