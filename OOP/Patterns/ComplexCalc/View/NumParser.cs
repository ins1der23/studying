using System.Numerics;

class NumParser<N> where N : AbstractNum
{
    AbstractNum someNum;




    // public static string GetComplexNum(string num, bool clear = true)
    // {
    //     Complex output = 0;
    //     bool flag = true;
    //     do
    //     {
    //         flag = int.TryParse(Console.ReadLine(), out num) || num == 0;
    //     } while (!flag);
    //     return num;
    // }

    public static bool IsComplex(string input)
    {
        string[] temp = input.Split("");
        bool result = double.TryParse(temp[0], out _);
        if (!result) return result;
        result = double.TryParse(temp[2], out _);
        return result;
    }


    //принимает на вход проверенную строку 
    public static AbstractNum ToComplexNum(string checkedInput)
    {
        string[] temp = checkedInput.Split("");
        _ = double.TryParse(temp[0], out double first);
        _ = double.TryParse(temp[2], out double second);
        return new ComplexNum(new Complex(first, second));
    }

    public  AbstractNum ToNum(string checkedInput)
    {

  
         return someNum.ToNum(checkedInput);
       
        

    }







    public static bool IsNumeric(string num)
    {
        num = num.Replace(" ", "");

        if (num.Equals(string.Empty)) return false;

        if (!double.TryParse(num.First().ToString(), out _) ||
            !double.TryParse(num.Last().ToString(), out _) ||
             num.Last().Equals("+") || num.Last().Equals("-"))
            return false;

        if (num.Any(x => !double.TryParse(x.ToString(), out _) &&
                   !x.ToString().Equals("+") &&
                   !x.ToString().Equals("-")))
            return false;

        if (num.Count(x => x.ToString().Equals("+")) > 1 ||
            num.Count(x => x.ToString().Equals("-")) > 1 ||
            num.Any(x => x.ToString().Equals("-")) && num.Any(x => x.ToString().Equals("-"))
            )
            return false;

        return true;
    }

}