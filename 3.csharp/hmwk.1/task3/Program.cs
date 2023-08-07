// Задача 3: Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным (делится ли оно на два без остатка).
// 4 -> да
// -3 -> нет
// 7 -> нет

int ReadLn(string msg)
{
   Console.Write(msg);
   return Convert.ToInt32(Console.ReadLine());
}

int num = ReadLn("Введите число: ");

if (num % 2 == 0)
{
   System.Console.WriteLine("Число - чётное");
}
else
{
   System.Console.WriteLine("Число - нечётное");
}
