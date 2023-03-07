int StepPlusOne(int step, int number = 0)
    {
        if (step <= 0) return number;
        else
        {
            number = StepPlusOne(step - 1, number + 2);
            return number;

        }
    }

    int b = StepPlusOne(5,0);
    Console.WriteLine(b);