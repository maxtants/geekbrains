// Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.
// 14212 -> нет
// 12821 -> да
// 23432 -> да

int ReadLn(string msg)
{
   Console.Write(msg);
   return Convert.ToInt32(Console.ReadLine());
}

bool CheckInput(int num) 
{
    if (num > 9999 && num < 100000)
    {
        return true;
    } 
    else
    {
        return false;
        System.Console.WriteLine("Ошибка ввода!");
    }
}

int[] MakeArray(int num)
{
    int[] array = new int[5];

    for (int i = 0; i < 5 ; i++)
    {
        array[i] = num % 10;
        num /= 10; 
    }
    
    return array;
}


Console.Clear();
int num = ReadLn("Введите пятизначное число: ");
CheckInput(num);
num = num < 0 ? -num : num;
int[] array = MakeArray(num);

if (array[0] == array[4] && array[1] == array[3])
{
    System.Console.WriteLine("ДА, это палиндром");
} else
{
    System.Console.WriteLine("НЕТ, это не палиндром");
}



