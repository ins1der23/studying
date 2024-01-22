using System.Collections.Generic;
class ViewDecorator : IView
{
    private readonly Logger logger;
    private readonly View oldView;



    public ViewDecorator(View oldView, Logger logger)
    {
        this.oldView = oldView;

        this.logger = logger;

    }


    public string GetNumeric(string message, string inputNum, string inputError, bool clear = false)
    {
        string output = oldView.GetNumeric(message, inputNum, inputError, clear);
        logger.Alert("Пользователь ввел число", output);
        return output;
    }

    public string GetOperation(string message, string inputError,  bool clear = false)
    {
        string output = oldView.GetOperation(message, inputError, clear);
        logger.Alert("Пользователь ввел операцию", output);
        return output;
    }

    public string GetString(string text, bool clear = false)
    {
        string output = oldView.GetString(text, clear);
        logger.Alert("Пользователь ввел строку", output);
        return output;
    }

    public void PressEnter(string message, bool clear = false)
    {
        logger.Alert("Ожидаем продолжения");
        oldView.PressEnter(message, clear);
    }

    public void ShowString(string text, bool clear = false)
    {
        logger.Alert("Показываем пользователю строку", text);
        oldView.ShowString(text, clear);
    }

}