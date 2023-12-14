// Задача 2: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.
// 2, 3, 7 -> 7
// 44 5 78 -> 78
// 22 3 9 -> 22

int ReadLn(string msg)
{
   Console.Write(msg);
   return Convert.ToInt32(Console.ReadLine());
}

int max = ReadLn("Введите первое число: ");
int num2 = ReadLn("Введите второе число: ");
int num3 = ReadLn("Введите третье число: ");

if (num2 > max)
{
   max = num2;
}

if (num3 > max)
{
   max = num3;
}

Console.WriteLine($"Наибольшее число: {max}");