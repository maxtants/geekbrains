import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] arr = {4, 2, 7, 5, 1, 3, 8, 6, 9};
        analyzeNumbers(arr);

    }

    public static void analyzeNumbers(Integer[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.printf("Minimum is %d \n", arr[0]);
        System.out.printf("Maximum is %d \n", arr[arr.length - 1]);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("Average is = %d", sum / arr.length);
    }
}
