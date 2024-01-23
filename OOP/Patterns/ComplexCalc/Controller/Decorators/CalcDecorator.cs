/// <summary>
/// Класс, объединяющий Logger и ICalcSelecter
/// </summary>
class CalcDecorator : ICalcSelecter
{
    /// <summary>
    /// ICalcSelecter, с которым нужно объединить логгер
    /// </summary>
    private readonly ICalcSelecter oldCalcSelecter;

    /// <summary>
    /// Переменная для логгера
    /// </summary>
    private readonly Logger logger;

    /// <summary>
    /// Текст логгера
    /// </summary>
    readonly LoggerText loggerText;

    /// <summary>
    /// Конструктор CalcDecorator
    /// </summary>
    /// <param name="oldCalcSelecter">Передаваемый ICalcSelecter, с которым нужно объединить логгер</param>
    /// <param name="logger">Переменная для логгера</param>
    public CalcDecorator(CalcSelecter oldCalcSelecter, Logger logger)
    {
        this.oldCalcSelecter = oldCalcSelecter;
        this.logger = logger;
        loggerText = new();
    }

    /// <summary>
    ///Метод вычисления с логированием
    /// </summary>
    /// <returns>INum результат</returns>
    public INum Calculate()
    {
        logger.Write(loggerText.CalcStart);
        INum output = oldCalcSelecter.Calculate();
        if (output != null)
            logger.Write(loggerText.ResultGot, output.ToString()!);
        else logger.Write(loggerText.ZeroError);
        return output!;
    }
}