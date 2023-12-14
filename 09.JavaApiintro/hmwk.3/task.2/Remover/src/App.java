import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        removeEvenNumbers(arr);
    }

    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                continue;
            }
            list.add(arr[i]);
        }
        Integer[] arr2 = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(arr2));
    }
}
