interface IView
{
    string GetString(string text, bool clear = true);
    void ShowString(string text, bool clear = true);
    void PressEnter(string message, bool clear = true);
}
