class Department
{
    public int id { get; set; }
    public string title { get; set; }
    public Department(int id, string title)
    {
        this.id = id;
        this.title = title;
    }

    public override string ToString() => $"id: {this.id} Department: {this.title}";


    
    //     public override string ToString() 
    //     {
    //         return $"id: {this.id} Department: {this.title}";
    //     }
}


