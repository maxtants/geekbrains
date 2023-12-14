// Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N.
// 3 -> 1, 8, 27
// 5 -> 1, 8, 27, 64, 125


int ReadLn(string msg)
{
   Console.Write(msg);
   return Convert.ToInt32(Console.ReadLine());
}

int GetCube(int a)
{
    return a * a * a;
}

void PrintCubes(int num)
{
    System.Console.Write($"Кубы чисел от 1 до {num}: 1");
    for (int i = 2; i <= num ; i++)
    {
        System.Console.Write(", " + GetCube(i));
    }
}

Console.Clear();
int num = ReadLn("Введите целое чило: "); 
PrintCubes(num);