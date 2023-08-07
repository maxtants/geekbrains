// Задача 1: Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.
// 3, 5 -> 243 (3⁵)
// 2, 4 -> 16

int ReadLn(string msg)
{
   Console.Write(msg);
   return Convert.ToInt32(Console.ReadLine());
}

int PowerNumber(int num, int pow)
{
    if (pow == 0) return 1;
    if (pow == 1) return num;

    int res = num;
    for (int i = 2; i <= pow ; i++)
    {
        res *= num;
    }
    return res;
}

Console.Clear();
int num = ReadLn("Введите число: ");
int pow = ReadLn("Введите степень: ");
int res = PowerNumber(num, pow);
System.Console.WriteLine($"Число {num} в степени {pow} равно: {res}");

