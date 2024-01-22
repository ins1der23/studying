/// <summary>
/// Класс для выбора калькулятора в зависимости от типа вычисляемых чисел
/// </summary>
class CalcSelecter : ICalcSelecter
{
    private readonly ICalc calc;
    private readonly INum first;
    private readonly string operation;
    private readonly INum second;

    /// <summary>
    /// Конструктор с парметрами вычисления, 
    /// присваивает значение calc  в зависмости от типа вычисляемых чисел
    /// </summary>
    /// <param name="first"></param>
    /// <param name="operation"></param>
    /// <param name="second"></param>
    public CalcSelecter(INum first, string operation, INum second)
    {
        this.first = first;
        this.operation = operation;
        this.second = second;
        if (first is ComplexNum || second is ComplexNum) calc = new ComplexCalc();
        else calc = new RealCalc();
    }
    /// <summary>
    /// Метод вызывающий calculate у выбранного калькулятора
    /// </summary>
    /// <returns></returns>
    public INum Calculate() => calc.Calculate(first, operation, second);

}