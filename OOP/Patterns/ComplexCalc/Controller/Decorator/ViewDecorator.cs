using System.Collections.Generic;
class ViewDecorator : IView
{
    private readonly Logger logger;
    readonly LoggerText loggerText;
    private readonly View oldView;



    public ViewDecorator(View oldView, Logger logger)
    {
        this.oldView = oldView;
        this.logger = logger;
        loggerText = new();
    }
    public string GetString(string text, bool clear = false)
    {
        string output = oldView.GetString(text, clear);
        logger.Write(loggerText.StringGot, output);
        return output;
    }
    public void PressEnter(string message, bool clear = false)
    {
        logger.Write(loggerText.AwaitContinue);
        oldView.PressEnter(message, clear);
    }
    public void ShowString(string text, bool clear = false)
    {
        logger.Write(loggerText.StringShown, text);
        oldView.ShowString(text, clear);
    }

}