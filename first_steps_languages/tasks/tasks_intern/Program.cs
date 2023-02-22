﻿using System;
using System.Reflection;
using System.Data;
using static Shared;
// По двум заданным числам проверять является ли первое квадратом второго (блок-схема, js)
Console.WriteLine(Task("По двум заданным числам проверять является ли первое квадратом второго"));
double first = GetDouble("Введите первое число: ");
double second = GetDouble("Введите второе число ");
if (SquareCheck(first, second)) Console.WriteLine($"{first} является квадратом {second}.");
else Console.WriteLine($"{first} не является квадратом {second}.");
// Вывести большее и меньшее число
System.Console.WriteLine(MoreCheck(first, second));

// По заданному номеру дня недели вывести его название (блок-схема, js)
Console.WriteLine(Task("По заданному номеру дня недели вывести его название"));
string[] Days = { "Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс" };
int day = GetInteger("Введите номер дня недели ");
day = RangeForNumber(day, 1, 7, "Не является днем недели");
System.Console.WriteLine($"День {day} это {Days[day - 1]}");

// Найти максимальное из трех чисел
Console.WriteLine(Task("Найти максимальное из трех чисел"));
int[] Numbers = CreateIntArray(6);
Console.WriteLine(FillArrayRandom(Numbers, -9, -1));
Console.WriteLine("Максимальное число - {0}.", Max(Numbers));
// Выяснить является ли число чётным (блок-схема, js)
if (EvenCheck(Max(Numbers))) Console.WriteLine("{0} четное.", Max(Numbers));
else Console.WriteLine("{0} - нечетное.", Max(Numbers));
// Показать числа от -N до N (блок-схема, js)
int someN = RandomFromArray(Numbers);
Console.WriteLine("Возмем число {0}", someN);
System.Console.WriteLine(ToMinusN(someN));
System.Console.WriteLine(EvenToN(someN));