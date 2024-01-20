class Controller
{
    
    View view;

    public Controller(View view)
    {
        this.view = view;
    }
    internal View View { get => view; set => view = value; }


    public void Run()
    {
        
        string first = View.GetString(View.Text.InputNum);
        
    }
}