// Задача 4: * Напишите программу, которая заполнит спирально квадратный массив.
// Например, на выходе получается вот такой массив:
// 01 02 03 04
// 12 13 14 05
// 11 16 15 06
// 10 09 08 07

int ReadInput(string msg)
{
    System.Console.Write(msg);
    return Convert.ToInt32(Console.ReadLine());
}

int[,] Create2dArray(int m, int n)
{
    int[,] array = new int[m, n];
    
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            array[i, j] = int.Parse($"{i+1}"+$"{j+1}");
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

int[] GetSpiralSequence(int[,] array)
{
    int[] spiralSequence = new int[array.GetLength(1) * array.GetLength(1)];
    int count = 0;
    int[,] tempArray = array;

    while(tempArray.Length > 2)
    {
        int[] firstRowElements = ReadFirstRow(tempArray);
        for (int i = count; i < count + tempArray.GetLength(1); i++)
        {
            spiralSequence[i] = firstRowElements[i - count];
        }
        count += tempArray.GetLength(1);
        tempArray = TrimRotateArray(tempArray);
    }

    spiralSequence[spiralSequence.Length - 2] = tempArray[0, 0];
    spiralSequence[spiralSequence.Length - 1] = tempArray[1, 0];

    return spiralSequence;
}

int[] ReadFirstRow(int[,] tempArray)
{
    int[] firstRowElements = new int[tempArray.GetLength(1)];
    for (int i = 0; i < tempArray.GetLength(1); i++)
    {
        firstRowElements[i] = tempArray[0,i];
    }
    return firstRowElements;
}

int[,] TrimRotateArray(int[,] tempArray)
{
    int[,] trimmedArray = new int[tempArray.GetLength(0) - 1, tempArray.GetLength(1)];

    for (int i = 0; i < trimmedArray.GetLength(0); i++)
    {
        for (int j = 0; j < trimmedArray.GetLength(1); j++)
        {
            trimmedArray[i, j] = tempArray[i+1, j];
        }
    }

    int[,] RotatedArray = new int[trimmedArray.GetLength(1), trimmedArray.GetLength(0)];
    int count1 = 0;
    int count2 = 1;

    for (int i = 0; i < RotatedArray.GetLength(0); i++)
    {
        for (int j = 0; j < RotatedArray.GetLength(1); j++)
        {
            RotatedArray[i, j] = trimmedArray[count1, trimmedArray.GetLength(1) - count2];
            count1++;
            
        }
        
        count1 = 0;
        count2++;
    }

    return RotatedArray;
}

int[,] MakeSpiralArray(int[] spiralSequence, int colsCount)
{
    int[,] spiralArray = new int[colsCount, colsCount];
    for (int i = 0; i < spiralSequence.Length; i++)
    {
        spiralArray[spiralSequence[i] / 10 - 1, spiralSequence[i] % 10 - 1] = i + 1;
    }

    return spiralArray;
}

Console.Clear();
int m = ReadInput("Количество строк в массиве: ");
System.Console.WriteLine();
int[,] array = Create2dArray(m, m);
int[] spiralSequence = GetSpiralSequence(array);
Print2dArray(MakeSpiralArray(spiralSequence, m));

