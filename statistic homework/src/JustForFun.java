import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class JustForFun {
    public static void main(String[] args) {
        int[] arr = {13, 9, 11, 4, 22, 27, 17, 16, 15, 14, 10, 6, 18, 14, 8, 6};
        HashMap<Integer,Integer> map = new HashMap<>();
        createKeys(map, arr);
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
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 0);
            }
        }
        // Count how many duplicate values there are.
        for (int i : map.keySet()) {
            for (int j : arr) {
                if (i == j) {
                    int value = map.get(i);
                    value += 1;
                    map.put(i, value);
                }
            }
        }
        // Find the maximum value.
        for (int i : map.values()) {
            int temp = 0;
            if (i > temp) {
                temp = i;
            }
        }

//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            int key = entry.getKey();
//            int value = entry.getValue();
//            System.out.println("Key: " + key + ", Value: " + value);
//        }
    }

    private static void createKeys(HashMap<Integer, Integer> map, int[] arr ) {
        // Build non-repeating keys.
        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 0);
            }
        }
    }
}
