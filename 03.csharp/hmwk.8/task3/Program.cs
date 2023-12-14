// Задача 3: Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.
// 2 4 | 3 4 2
// 3 2 | 3 3 1
// Результирующая матрица будет:
// 18 20 8
// 15 18 7

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

int[,] Multiply2dArrays(int[,] array1, int[,] array2)
{
    int[,] resultArray = new int[array1.GetLength(0), array2.GetLength(1)];
    for (int i = 0; i < resultArray.GetLength(0); i++)
    {
        for (int j = 0; j < resultArray.GetLength(1); j++)
        {
            resultArray[i,j] = GetMultiplicationArrayElement(i, j, array1, array2);   
        }       
    }
    return resultArray;
}

int GetMultiplicationArrayElement(int row, int col, int[,] array1, int[,] array2)
{
    int sum = 0;
    for (int i = 0; i < array1.GetLength(1); i++)
    {
        sum += array1[row, i] * array2[i, col];      
    }
    return sum;
}

Console.Clear();
int m = ReadInput("Количество строк в массиве 1: ");
int n = ReadInput("Количество столбцов в массиве 1: ");
int l = ReadInput("Количество столбцов в массиве 2: ");
System.Console.WriteLine();
System.Console.WriteLine("Исходный массив 1: ");
int[,] array1 = Create2dArray(m, n);
Print2dArray(array1);
System.Console.WriteLine();
System.Console.WriteLine("Исходный массив 2: ");
int[,] array2 = Create2dArray(n, l);
Print2dArray(array2);
System.Console.WriteLine();
System.Console.WriteLine("Результат произведения массивов: ");
Print2dArray(Multiply2dArrays(array1, array2));
System.Console.WriteLine();