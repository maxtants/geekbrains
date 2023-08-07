// Задача 2: Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.
// 452 -> 11
// 82 -> 10
// 9012 -> 12


int ReadLn(string msg)
{
   Console.Write(msg);
   return Convert.ToInt32(Console.ReadLine());
}

int SumDigits(int num)
{
    if (num < 10) return num;
    
    int sum = 0;
    while(num > 9)
    {
        sum += num % 10;
        num /= 10;
    }
    
    return sum + num;
}

Console.Clear();
int num = ReadLn("Введите число: ");
int sum = SumDigits(num);
System.Console.WriteLine($"Сумма цифр числа {num} равна: {sum}");