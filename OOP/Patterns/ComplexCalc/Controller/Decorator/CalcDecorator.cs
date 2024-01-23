class CalcDecorator : ICalcSelecter
{
    private readonly ICalcSelecter oldCalcSelecter;
    private readonly Logger logger;
    readonly LoggerText loggerText;

    public CalcDecorator(CalcSelecter oldCalcSelecter, Logger logger)
    {
        this.oldCalcSelecter = oldCalcSelecter;
        this.logger = logger;
        loggerText = new();
    }

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