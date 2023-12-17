class DataBase
{
    List<Department> depTable;
    List<Worker> workerTable;
    public DataBase()
    {
        depTable = new();
        workerTable = new();
    }

    public void AppendWorker(Worker worker) 
    {
        workerTable.Add(worker);
    }

    public void AppendDepartment(Department department) => depTable.Add(department);

    public string SelectAllDep()
    {
        string output = String.Empty;

        foreach (var item in depTable)
        {
            output += $"{item.title}\n";
        }
        return output;
    }

    public string SelectAllWorkers()
    {
        string output = String.Empty;

        foreach (var item in workerTable)
        {
            output += $"{item.fullName} {item.age} {depTable[item.depId].title}\n";
        }
        return output;
    }
    public List<string> Report()
    {
        List<string> output = new List<string>();
        foreach (var item in workerTable)
        {
            output.Add($"{item.fullName} {item.age} {item.salary} {depTable[item.depId].title}");
        }
        return output;
    }
}

