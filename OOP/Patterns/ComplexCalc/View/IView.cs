interface IView
{
    string GetString(string text, bool clear = true);

    public void ShowString(string text, bool clear = true);

    public void PressEnter(string message, bool clear = true);

    public string GetNumeric(string message, string inputNum, string inputError, bool clear = true);

    public string GetOperation(string message, string inputError, bool clear = true);

}
