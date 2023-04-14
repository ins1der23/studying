Worker worker1 = new Worker(0, 2, 23, "Мария Ивановна", 7734);
Worker worker2 = new Worker(1, 0, 26, "Мария Степановна", 3456);
Worker worker3 = new Worker(2, 2, 33, "Мария Ильинична", 5432);
Worker worker4 = new Worker(3, 0, 23, "Мария Сергеевна", 1432);

Department dep1 = new Department(0, "Информационные технологии");
Department dep2 = new Department(1, "Отдел кадров");
Department dep3 = new Department(2, "Бухгалтерия");

DataBase db = new DataBase();

db.AppendWorker(worker1);
db.AppendWorker(worker2);
db.AppendWorker(worker3);
db.AppendWorker(worker4);

db.AppendDepartment(dep1);
db.AppendDepartment(dep2);
db.AppendDepartment(dep3);

Console.WriteLine(db.SelectAllDep());
Console.WriteLine(db.SelectAllWorkers());

foreach (var item in db.Report())
{
    Console.WriteLine(item);
}

