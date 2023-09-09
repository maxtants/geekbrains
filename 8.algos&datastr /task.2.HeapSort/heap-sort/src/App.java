import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) 
        {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        HeapSort.sort(array);

        for (int el : array) 
        {
            System.out.println(el);
        }

    }
}


