// Задача 3: Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.
// [3.22, 4.2, 1.15, 77.15, 65.2] => 77.15 - 1.15 = 76

double[] GenerateArray(int arraySize)
{
    double[] array = new double[arraySize];
    Random random = new Random();
    for (int i = 0; i < array.Length ; i++)
    {
        array[i] = 100 * random.NextDouble();
    }
    return array;
}

int ReaadInput(string msg)
{
    System.Console.Write(msg);
    return Convert.ToInt32(Console.ReadLine());
}

double GetMaxMinSpread(double[] array)
{
    double max = array[0];
    double min = array[0];
    for (int i = 1; i < array.Length; i++)
    {
        if (array[i] < min) 
        {
            min = array[i];
        }
        if (array[i] > max)
        {
            max = array[i];
        }
    }
    return max - min;
}


Console.Clear();
int arraySize = ReaadInput("Введите размер массива: ");
double[] array = GenerateArray(arraySize);

foreach (double item in array)
{
    System.Console.WriteLine(item);
}

System.Console.WriteLine();
System.Console.WriteLine($"Разница между максимальным и минимальным элементом массива: {GetMaxMinSpread(array)}");

