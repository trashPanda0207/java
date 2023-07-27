import java.util.Scanner;

public class PrintEvery3 {
    private static void printEvery3() {
        for (int i = 1; i <= 88; i+=3) {
            System.out.println(i);
        }
    }

    private static void nineTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = arr.length -1; i >= 0; i--) {
            result[j] = arr[i];
            j++;
        }

        return result;
    }

    private static int addUpTo(int n) {
        // Arithmetic series
        // return ((1 + n) * n) / 2;

        // For loop
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    private static void position(String str) {
        String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i <= str.length() - 1; i ++) {
            for (int j = 0; j <= capital.length() -1; j++) {
               if (str.charAt(i) == capital.charAt(j)) {
                   System.out.println(str.charAt(i) + " " + i);
                   return;
               }
            }
        }
        System.out.println("-1");
    }

    private static Boolean confirmEnding(String whole, String last) {
        int headIndex = (whole.length() -1) - (last.length() -1);
        if (whole.substring(headIndex).equals(last)) {
            return true;
        }
        return false;
    }

    private static Boolean findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void pyramid(int lines) {
        String stars = "*";

        for (int i = 0; i < lines; i++) {
            System.out.println(stars);
            stars += "*";
        }
    }

    private static int findSmallCount(int[] arr, int n) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < n) {
                counter ++;
            }
        }
        return counter;
    }

    private static double totalDistance() {
        Scanner s = new Scanner(System.in);
        System.out.print("Set the height: ");
        double height = s.nextDouble();
        System.out.print("Set the times: ");
        int times = s.nextInt();
        double totalDis = height;
        if (times == 1) {
            return height;
        } else {
            for (int i = 1; i < times; i++) {
                totalDis += (height / Math.pow(2, i)) * 2;
            }
        }
        return totalDis;
    }

    private static int dateCounter() {
        Scanner s = new Scanner(System.in);
        System.out.print("Set the year: ");
        int year = s.nextInt();
        System.out.print("Set the month: ");
        int month = s.nextInt();
        System.out.print("Set the day: ");
        int day = s.nextInt();

        int days = 0;
        int[] everyMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (leapYear(year)) {
            everyMonth[1] = 29;
        }

        for (int i = 0; i < month - 1; i++) {
            days += everyMonth[i];
        }
        return days += day;
    }

    private static boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static boolean palindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    private static void narcissisticNumber() {

        for (int i = 100; i < 1000; i++) {
            int units = i % 10;
            int tens = ((i % 100) - units) / 10;
            int hundreds = ((i % 1000) - (units + tens)) / 100;
            int association = pow3(hundreds) + pow3(tens) + pow3(units);
            if (i == association) {
                System.out.println(i);
            }
        }
    }

    private static int pow3(int n) {
        return (int) Math.pow(n, 3);
    }
    public static void main(String[] args) {
        narcissisticNumber();
    }
}
