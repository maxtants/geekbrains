// Задача 1: Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве.
// [345, 897, 568, 234] -> 2

int[] GenerateArray(int arraySize)
{
    int[] array = new int[arraySize];
    Random random = new Random();
    for (int i = 0; i < array.Length ; i++)
    {
        array[i] = random.Next(100, 1000);
    }
    return array;
}

int ReaadInput(string msg)
{
    System.Console.Write(msg);
    return Convert.ToInt32(Console.ReadLine());
}

int CountEvenNumbers(int[] array)
{
    int count = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] % 2 == 0) 
        {
            count++;
        }
    }
    return count;
}


Console.Clear();
int arraySize = ReaadInput("Введите размер массива: ");
int[] array = GenerateArray(arraySize);

foreach (int item in array)
{
    System.Console.WriteLine(item);
}

System.Console.WriteLine();
System.Console.WriteLine($"Количество чётных чисел в массиве: {CountEvenNumbers(array)}");

