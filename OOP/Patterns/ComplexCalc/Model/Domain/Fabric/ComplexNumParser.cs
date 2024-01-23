
using System.Numerics;

/// <summary>
/// Класс для парсинга строки в ComplexNum
/// </summary>
class ComplexNumParser : INumParser<INum>

{
    /// <summary>
    /// Проверка возможности преобразование сроки в ComplexNum
    /// </summary>
    /// <param name="input"></param>
    /// <returns>Результат проверки</returns>
    public bool IsValid(string input)
    {
        if (!input.Contains('i')) return false;
        if (input.StartsWith("-")) input = input[1..];
        if (!input.Contains('-') && !input.Contains('+')) return false;
        return true;
    }

    /// <summary>
    /// Конвертирует в ComplexNum проверенную строку 
    /// </summary>
    /// <param name="input"></param>
    /// <returns>ComplexNum или null в случае неудачи</returns>
    public INum ToNum(string input)
    {
        if (IsValid(input))
        {
            input = input.Replace('.', ',');
            input = input[..^1];

            string module = string.Empty;

            if (input.StartsWith('-'))
            {
                module = "-";
                input = input[1..];
            }

            int index = 0;
            if (input.Contains('-')) index = input.IndexOf('-');
            if (input.Contains('+')) index = input.IndexOf('+');
            string first = input[..index];

            first = module + first;

            module = string.Empty;
            string second = string.Empty;

            if (!input.Contains('+'))
            {
                if (input.Count(x => x.ToString().Equals("-")) == 2)
                    second = input[(index + 2)..];
                if (input.Count(x => x.ToString().Equals("-")) == 1)
                {
                    module = "-";
                    second = input[(index + 1)..];
                }
            }
            else second = input[(index + 1)..];

            second = module + second;

            _ = double.TryParse(first, out double real);
            _ = double.TryParse(second, out double imaginary);
            return new ComplexNum(new Complex(real, imaginary));
        }
        return null!;
    }
}
