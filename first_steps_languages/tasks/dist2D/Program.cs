Console.WriteLine("Введите кординаты первой точки");
double coordX1 = double.Parse(Console.ReadLine());
double coordY1 = double.Parse(Console.ReadLine());
Console.WriteLine("Введите кординаты второй точки");
double coordX2 = double.Parse(Console.ReadLine());
double coordY2 = double.Parse(Console.ReadLine());
double Dist = 1;
double DistX, DistY;
while (coordX1 == coordX2 && coordY1 == coordY2)
{
    Console.WriteLine("Одна и та же точка, введите координаты заново");
    Console.WriteLine("Введите кординаты первой точки");
    coordX1 = double.Parse(Console.ReadLine());
    coordY1 = double.Parse(Console.ReadLine());
    Console.WriteLine("Введите кординаты второй точки");
    coordX2 = double.Parse(Console.ReadLine());
    coordY2 = double.Parse(Console.ReadLine());
}
Console.WriteLine("Считаем расстояние");
if (coordX1 != coordX2 && coordY1 != coordY2)
{
    DistX = coordX2 - coordX1;
    DistY = coordY2 - coordY1;
    Dist = Math.Sqrt(DistX * DistX + DistY * DistY);
}
else
{
    if (coordX1 == coordX2)
    {
        Dist = Math.Abs(coordY2 - coordY1);
    }
    if (coordY1 == coordY2)
    {
        Dist = Math.Abs(coordX2 - coordX1);
    }
}
Console.WriteLine("Расстояние между точками = {0}", Dist);