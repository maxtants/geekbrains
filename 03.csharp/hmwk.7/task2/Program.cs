// Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, и возвращает значение этого элемента или же указание, что такого элемента нет.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 17 -> такого числа в массиве нет

// Задача 47. Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.
// m = 3, n = 4.
// 0,5 7 -2 -0,2
// 1 -3,3 8 -9,9
// 8 7,8 -7,1 9

int[,] Create2dArray(int m, int n)
{
    int[,] array = new int[m, n];
    Random random = new Random();
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            array[i, j] = random.Next(100, 1000);
        }
    }
    return array;
}

void Print2dArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            System.Console.Write(array[i, j] + "\t");
        }
        System.Console.Write("\n");
    }
}

int ReadInput(string msg)
{
    System.Console.Write(msg);
    return Convert.ToInt32(Console.ReadLine());
}

Console.Clear();
int m = ReadInput("Количество строк: ");
int n = ReadInput("Количество столбцов: ");
int a = ReadInput("Введите номер строки: ");
int b = ReadInput("Введите номер столбца: ");
int[,] array = Create2dArray(m,n);
Print2dArray(array);

System.Console.WriteLine();
if (a <= m && b <= n)
{
    System.Console.WriteLine($"Значение элемента: {array[a-1, b-1]}");
}
else
{
    System.Console.WriteLine("Такого элемента в массиве нет!");
}
