// Задача 2: Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.
// [3, 7, 23, 12] -> 19
// [-4, -6, 89, 6] -> 0

int[] GenerateArray(int arraySize)
{
    int[] array = new int[arraySize];
    Random random = new Random();
    for (int i = 0; i < array.Length ; i++)
    {
        array[i] = random.Next(-99, 100);
    }
    return array;
}

int ReaadInput(string msg)
{
    System.Console.Write(msg);
    return Convert.ToInt32(Console.ReadLine());
}

int GetSumForUnevenPosition(int[] array)
{
    int sum = 0;
    for (int i = 0; i < array.Length ; i++)
    {
        if (i % 2 != 0)
        {
            sum += array[i]; 
        }
    }
    return sum;
}

Console.Clear();
int arraySize = ReaadInput("Введите размер массива: ");
int[] array = GenerateArray(arraySize);

foreach (int item in array)
{
    System.Console.WriteLine(item);
}

System.Console.WriteLine();
System.Console.WriteLine($"Cумма элементов, стоящих на нечётных позициях: {GetSumForUnevenPosition(array)}");
