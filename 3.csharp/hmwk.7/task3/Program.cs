// Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.



int[,] Create2dArray(int m, int n)
{
    int[,] array = new int[m, n];
    Random random = new Random();
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            array[i, j] = random.Next(0, 10);
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

double[] GetAverageForEachColumn (int[,] array)
{
    double sum = 0;
    double[] resArray = new double[array.GetLength(1)];
    for (int i = 0; i < array.GetLength(1); i++)
    {
        for (int j = 0; j < array.GetLength(0); j++)
        {
            sum += array[j,i];
        }
        resArray[i] = sum / (double) array.GetLength(0);
        sum = 0;
    }
    return resArray;
}

void PrintAverageForEachColumn(double[] resArray) 
{
    for (int i = 0; i < resArray.Length; i++)
    {
        System.Console.WriteLine($"Среднее арифметическое элементов {i+1} столбца: {resArray[i]}");
    }
}


Console.Clear();
int m = ReadInput("Количество строк: ");
int n = ReadInput("Количество столбцов: ");
int[,] array2d = Create2dArray(m, n);
Print2dArray(array2d);
System.Console.WriteLine();
PrintAverageForEachColumn(GetAverageForEachColumn(array2d));