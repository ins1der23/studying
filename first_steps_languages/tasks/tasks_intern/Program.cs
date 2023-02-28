using System;
using System.Reflection;
using System.Data;
using static Shared;
// По двум заданным числам проверять является ли первое квадратом второго (блок-схема, js)
Console.WriteLine(Task("Сначала мы возьмем два числа"));
double first = GetDouble("Введите первое число: ");
double second = GetDouble("Введите второе число ");
if (SquareCheck(first, second)) Console.WriteLine($"{first} является квадратом {second}.");
else Console.WriteLine($"{first} не является квадратом {second}.");
// Вывести большее и меньшее число
Console.WriteLine(MoreCheck(first, second));

// По заданному номеру дня недели вывести его название (блок-схема, js)
Console.WriteLine(Task("Можно по номеру дня недели вывести его название"));
string[] Days = { "Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс" };
int day = GetInteger("Введите номер дня недели: ");
day = RangeForNumber(day, 1, 7, "Не является днем недели");
Console.WriteLine($"День {day} это {Days[day - 1]}");

// Найти максимальное из трех чисел
Console.WriteLine(Task("Сейчас мы возьмем несколько чисел"));
int[] Numbers = CreateIntArray(6);
Console.WriteLine(FillArrayRandom(Numbers, -9, -1));
Console.WriteLine("Максимальное число: {0}.", Max(Numbers));

// Выяснить является ли число чётным (блок-схема, js)
if (EvenCheck(Max(Numbers))) Console.WriteLine("{0} четное.", Max(Numbers));
else Console.WriteLine("{0} - нечетное.", Max(Numbers));

// Показать числа от -N до N (блок-схема, js)
int someN = RandomFromArray(Numbers);
Console.WriteLine("Возмем число {0}", someN);
Console.WriteLine(ToMinusN(someN));

// Показать четные числа от 1 до N (блок-схема, js)
Console.WriteLine(EvenToN(someN));

// Показать последнюю цифру трёхзначного числа (блок-схема, js)
Console.WriteLine(Task("А сейчас можно взять трехзначное число"));
int some3Digits = GetInteger("Введите трехзначное число ");
some3Digits = RangeForNumber(some3Digits, 100, 1000, "Число не трехзначное");
Console.WriteLine("Третья цифра {0} - это {1}",some3Digits, ThirdDigit(some3Digits));

// Показать вторую цифру трёхзначного числа (блок-схема, js)
Console.WriteLine("Вторая цифра {0} - это {1}",some3Digits, SecondDigit(some3Digits));

// Удалить вторую цифру трёхзначного числа 
Console.WriteLine("Число {0} без второй цифры - это {1}", some3Digits, DeleteSecondDigit(some3Digits));