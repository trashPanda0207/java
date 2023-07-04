import java.util.Arrays;
import java.util.Hashtable;

public class JustForFun {
    public static void main(String[] args) {
        int[] arr = {13, 9, 11, 4, 22, 27, 17, 16, 15, 14, 10, 6, 18, 14, 8, 6};
        // System.out.println(mean(arr)); // Calculate the mean of arr.
        // System.out.println(median(bSorting(arr))); // Calculate the median of arr.
        mode(bSorting(arr));
    }

    private static int[] bSorting (int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static int mean (int[] arr) {
        int n = arr.length;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        return total / n;
    }

    private static int median (int[] sortedArr) {
        int n = sortedArr.length;
        if (n % 2 == 0) {
            return (sortedArr[n / 2] + sortedArr[n / 2 + 1]) / 2;
        } else {
            return sortedArr[(n + 1) / 2];
        }
    }

    private static void mode (int[] arr) {
       ; // I need to understand HashMap.
    }
}
