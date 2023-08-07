// Задайте двумерный массив. Напишите программу, которая упорядочивает по убыванию элементы каждой строки двумерного массива.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// В итоге получается вот такой массив:
// 7 4 2 1
// 9 5 3 2
// 8 4 4 2

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

int[,] Sort2dArayRows(int[,] array)
{
    int[,] sortedArray = new int[array.GetLength(0), array.GetLength(1)];
    
     for (int i = 0; i < array.GetLength(0); i++)
    {   
        int [] arrayRow = new int[array.GetLength(1)];
        for (int j = 0; j < array.GetLength(1); j++)
        {
            arrayRow[j] = array[i,j];
        }
        AddRowTo2dArray(i, sortedArray, Sort2dArayRow(arrayRow));
        
    }
    return sortedArray;
} 

int[] Sort2dArayRow(int[] arrayRow)
{
    bool isSorted = false;
    int count = 0;
    while (!isSorted)
    {
        for (int i = 0; i < arrayRow.Length - 1; i++)
        {
            if (arrayRow[i+1] > arrayRow[i])
            {
                int temp = arrayRow[i];
                arrayRow[i] = arrayRow[i+1];
                arrayRow[i+1] = temp;
                count++;
            }
        }
        if (count == 0)
        {
            isSorted = true;
        } 
        else
        {
            count = 0;
        }

    }
    return arrayRow;
}

void AddRowTo2dArray(int i, int[,] sortedArray, int[] arrayRow)
{
    for (int j = 0; j < arrayRow.Length; j++)
    {
        sortedArray[i, j] = arrayRow[j];
    }
}


Console.Clear();
int m = ReadInput("Количество строк: ");
int n = ReadInput("Количество столбцов: ");
System.Console.WriteLine();
int[,] array2d = Create2dArray(m, n);
System.Console.WriteLine("Исходный массив: ");
Print2dArray(array2d);
System.Console.WriteLine();
System.Console.WriteLine("Отсортированный массив: ");
Print2dArray(Sort2dArayRows(array2d));
System.Console.WriteLine();

