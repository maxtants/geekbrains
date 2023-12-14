// Задача 4: Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.
// 5 -> 2, 4
// 8 -> 2, 4, 6, 8

int ReadLn(string msg)
{
   Console.Write(msg);
   return Convert.ToInt32(Console.ReadLine());
}

void PrintEvenNumbers(int num)
{
   System.Console.Write($"Чётные числа от 1 до {num}: 2");
   int i = 4;
   while(i < num)
   {
      System.Console.Write($", {i}");
      i += 2;
   }
   if (i == num) System.Console.Write($", {i}");
}

Console.Clear();
int num = ReadLn("Введите число: ");
if (num < 0)
{
   System.Console.WriteLine("Число должно быть положительное!");
}
else if (num < 2)
{
    System.Console.WriteLine("Число должно быть больше единицы!");
}
else
{
   PrintEvenNumbers(num);
}
