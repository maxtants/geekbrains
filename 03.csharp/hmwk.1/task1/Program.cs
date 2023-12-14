//Задача 1: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.
// a = 5; b = 7 -> max = 7
// a = 2 b = 10 -> max = 10
// a = -9 b = -3 -> max = -3

int ReadLn(string msg)
{
   Console.Write(msg);
   return Convert.ToInt32(Console.ReadLine());
}

Console.Clear();
int num1 = ReadLn("Введите первое число: ");
int num2 = ReadLn("Введите второе число: ");

if (num1 > num2)
{
   Console.WriteLine($"Большее число: {num1}, меньшее число: {num2}");
}
else if (num1 < num2)
{
   Console.WriteLine($"Большее число: {num2}, меньшее число: {num1}");
}
else
{
   Console.WriteLine("Числа равны");
}