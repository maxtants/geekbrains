// Задача 3: Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.
// 6 -> да
// 7 -> да
// 1 -> нет

int ReadLn(string msg)
{
   Console.Write(msg);
   return Convert.ToInt32(Console.ReadLine());
}

void WeekendCheck(int num)
{
   if (num == 6 || num == 7)
   {
      System.Console.WriteLine("Это выходной день :)");
   }
   else
   {
      System.Console.WriteLine("Это раюочий день :(");
   }
}

Console.Clear();
int num = ReadLn("Введите число: ");

if (num >= 1 && num <= 7)
{
   WeekendCheck(num);
}
else
{
   System.Console.WriteLine("Число должно быть в интервале [1, 7]!");
}
