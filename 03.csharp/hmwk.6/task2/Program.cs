// Задача 43: Напишите программу, которая найдёт точку пересечения двух прямых, заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; значения b1, k1, b2 и k2 задаются пользователем.

// b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)

int GetInput(string msg)
{
    System.Console.Write(msg);
    return Convert.ToInt32(Console.ReadLine());
}

double GetX(double b1, double b2, double k1, double k2)
{
    return (b2 - b1) / (k1 - k2);
}

Console.Clear();
double b1 = GetInput("Введите b1: ");
double b2 = GetInput("Введите b2: ");
double k1 = GetInput("Введите k1: ");
double k2 = GetInput("Введите k2: ");
double x = GetX(b1, b2, k1, k2);
double y = k1 * x + b1;

System.Console.WriteLine($"Точка пересечения двух прямых: ({x}, {y})");
