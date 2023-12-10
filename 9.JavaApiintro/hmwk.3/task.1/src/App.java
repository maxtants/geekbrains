import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr =  {5, 1, 6, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
        int[] left = mergeSort(leftArr);
        int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);
        int[] right = mergeSort(rightArr);
        return merge(left, right);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] resArray = new int[arr1.length + arr2.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                resArray[k] = arr1[i];
                i++;
                k++;
            } else {
                resArray[k] = arr2[j];
                j++;
                k++;
            }
        }
        if (i < arr1.length) {
            for (int j2 = i; j2 < arr1.length; j2++) {
                resArray[k] = arr1[j2];
                k++;
            }
        }
        if (j < arr2.length) {
            for (int j3 = j; j3 < arr2.length; j3++) {
                resArray[k] = arr2[j3];
                k++;
            }
        }
        return resArray;
    }
}
