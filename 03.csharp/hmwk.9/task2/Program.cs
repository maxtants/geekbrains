// Задача 2: Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N с помощью рекурсии.
// M = 1; N = 15 -> 120
// M = 4; N = 8 -> 30

int ReadInput(string msg)
{
    System.Console.Write(msg);
    return Convert.ToInt32(Console.ReadLine());
}

int GetSumNaturalNums(int M, int N)
{
    if (M > N) return 0;   
    return M + GetSumNaturalNums(M + 1, N);
}

Console.Clear();
int M = ReadInput("Введите чило M: ");
int N = ReadInput("Введите чило N: ");

if (M > 0 && N > 0)
{
    System.Console.WriteLine($"Cумма натуральных элементов в промежутке от {M} до {N}: {GetSumNaturalNums(M, N)}");
} 
else
{
    System.Console.WriteLine("Вы ввели ненатуральное число!");
}
