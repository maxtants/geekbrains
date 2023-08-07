// Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.
// 0, 7, 8, -2, -2 -> 2
// 1, -7, 567, 89, 223-> 3

double[] GetInputArray(int arraySize)
{
    double[] array = new double[arraySize];
    
    for (int i = 0; i < array.Length ; i++)
    {
        array[i] = ReaadInput("Введите число: ");
    }
    return array;
}

int ReaadInput(string msg)
{
    System.Console.Write(msg);
    return Convert.ToInt32(Console.ReadLine());
}

void PrintArray(double[] array)
{
    foreach (double item in array)
    {
        System.Console.WriteLine(item);
    }
}

int CountElementsAboveZero(double[] array)
{
    int numberOfElementsAboveZero = 0;
    for (int i = 0; i < array.Length ; i++)
    {
        if (array[i] > 0)
        {
            numberOfElementsAboveZero++;
        }
    }
    return numberOfElementsAboveZero;
}

Console.Clear();
int arraySize = ReaadInput("Введите размер массива: ");
double[] array = GetInputArray(arraySize);
PrintArray(array);

System.Console.WriteLine();
System.Console.WriteLine($"Количество чисел больше нуля: {CountElementsAboveZero(array)}");

