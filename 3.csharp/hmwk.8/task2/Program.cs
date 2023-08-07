// Задача 2: Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7
// Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка

int ReadInput(string msg)
{
    System.Console.Write(msg);
    return Convert.ToInt32(Console.ReadLine());
}

int[,] Create2dArray(int m, int n)
{
    int[,] array = new int[m, n];
    Random random = new Random();
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            array[i, j] = random.Next(1, 10);
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

int[] GetRowsSums(int[,] array)
{
    int[] sums = new int[array.GetLength(0)];
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            sums[i] += array[i, j];
        }
    }
    return sums;
}

int GetMinSumRowNumber(int[] array)
{
    int min = array[0];
    int minI = 0;
    for (int i = 1; i < array.Length; i++)
    {
        if (array[i] < min)
        {
            min = array[i];
            minI = i;
        }
    }
    return minI + 1;
}

Console.Clear();
int m = ReadInput("Количество строк: ");
int n = ReadInput("Количество столбцов: ");
System.Console.WriteLine();
int[,] array2d = Create2dArray(m, n);
System.Console.WriteLine("Исходный массив: ");
Print2dArray(array2d);
System.Console.WriteLine();
System.Console.WriteLine("Суммы строк: ");
int[] array = GetRowsSums(array2d);
for (int i = 0; i < array.Length; i++)
{
    System.Console.WriteLine(array[i]);
}
System.Console.WriteLine();
System.Console.WriteLine($"Номер строки с наименьшей суммой элементов: {GetMinSumRowNumber(array)} строка");
System.Console.WriteLine();