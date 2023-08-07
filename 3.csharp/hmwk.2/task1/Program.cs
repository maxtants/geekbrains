// Задача 1: Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа. Не использовать строки
// 456 -> 5
// 782 -> 8
// 918 -> 1

int ReadLn(string msg)
{
   Console.Write(msg);
   return Convert.ToInt32(Console.ReadLine());
}

Console.Clear();
int num = ReadLn("Введите трехзначное число: ");
num = num < 0 ? -num : num;

if (num > 99 && num < 1000)
{
   System.Console.WriteLine($"Вторая цифра числа: {num / 10 % 10}");
}
else
{
   System.Console.WriteLine("Число должно быть трёхзначным :(");
}
