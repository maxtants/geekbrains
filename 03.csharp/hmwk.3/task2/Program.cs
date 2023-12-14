// Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве.
// A (3,6,8); B (2,1,-7), -> 15.84
// A (7,-5, 0); B (1,-1,9) -> 11.53

int ReadLn(string msg)
{
   Console.Write(msg);
   return Convert.ToInt32(Console.ReadLine());
}

double GetDistance(int x1, int y1, int z1, int x2, int y2, int z2)
{
    double res = Math.Sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) + (z2-z1)*(z2-z1));
    return res;
}

Console.Clear();

int x1 = ReadLn("Введите х1: ");
int y1 = ReadLn("Введите y1: ");
int z1 = ReadLn("Введите z1: ");

int x2 = ReadLn("Введите х2: ");
int y2 = ReadLn("Введите y2: ");
int z2 = ReadLn("Введите z2: ");

System.Console.WriteLine("Расстояние между точками: " + Math.Round(GetDistance(x1, y1, z1, x2, y2, z2), 2));