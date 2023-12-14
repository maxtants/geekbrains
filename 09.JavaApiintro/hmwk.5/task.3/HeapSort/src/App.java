import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[] { 17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1 };
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void buildTree(int[] tree, int sortLength, int top) {
        int max = top;
        int left = 2 * top + 1;
        int right = 2 * top + 2;

        if (left < sortLength && tree[left] > tree[max]) {
            max = left;
        }

        if (right < sortLength && tree[right] > tree[max]) {
            max = right;
        }

        if (max != top) {
            int temp = tree[top];
            tree[top] = tree[max];
            tree[max] = temp;

            buildTree(tree, sortLength, max);
        }
    }

    public static void sort(int[] sortArray, int sortLength) {
         for (int i = sortLength/2 - 1; i >= 0; i--) {
            buildTree(sortArray, sortLength, i);
         }

         for (int i = sortLength - 1; i >= 0; i--) {
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;

            buildTree(sortArray, i, 0);
         }
    }
}
