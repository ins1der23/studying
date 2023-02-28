void Author()
  {
    Console.WriteLine("I'm");
  }

   double[] CreateArray(int size)
  {
    // return Array.CreateInstance(typeof(int), 10);
    return new double[size];
  }

   string ArrayJoinToString(double[] array)
  {
    return $"[{String.Join(' ', array)}]";
  }

   double GetDataFromUser(string text)
  {
    double num = 0;
    bool flag = true;
    do
    {
      Console.Write($"{text}: ");
      flag = double.TryParse(Console.ReadLine(), out num);
    } while (!flag);
    return num;
  }

   void Fill(double[] array)
  {
    int size = array.Length;

    for (int i = 0; i < size; i++)
    {
      array[i] = GetDataFromUser($"Введите array[{i + 1}]");
    }
  }

   int GetIntValueFromUser(string text)
  {
    int num = 0;
    bool flag = true;
    do
    {
      Console.Write($"{text}: ");
      flag = int.TryParse(Console.ReadLine(), out num);
    } while (!flag);
    return num;
  }
