// Задача 2: Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет. Не использовать строки
// 645 -> 5
// 78 -> третьей цифры нет
// 32679 -> 6

int ReadLn(string msg)
{
   Console.Write(msg);
   return Convert.ToInt32(Console.ReadLine());
}

int GetThreeDigit(int num)
{
   int rem = num / 10;
   while(true)
   {
      if (rem < 1000) break;
      rem /= 10;
   }
   return rem;
}

void PrintThirdDigit(int num) => System.Console.WriteLine($"Третья цифра числа: {num % 10}");


Console.Clear();
int num = ReadLn("Введите число: ");
num = num < 0 ? -num : num;

if (num > 99 && num < 1000)
{
   PrintThirdDigit(num);
}
else if (num < 100)
{
   System.Console.WriteLine($"Третьей цифры у числа {num} нет");
}
else
{
  PrintThirdDigit(GetThreeDigit(num));
}
