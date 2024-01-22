class CalcDecorator : ICalcSelecter
{
    private readonly ICalcSelecter oldCalcSelecter;
    private readonly Logger logger;

    public CalcDecorator(CalcSelecter oldCalcSelecter, Logger logger)
    {
        this.oldCalcSelecter = oldCalcSelecter;
        this.logger = logger;
    }

    public INum Calculate()
    {
        logger.Alert("Вызываем калькулятор");
        INum output = oldCalcSelecter.Calculate();
        if (output != null)
            logger.Alert("Пользователь получил резльтат", output.ToString()!);
        else logger.Alert("Пользователь получил ошибку");
        return output!;

    }
}