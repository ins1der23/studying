import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 4, 2, 7, 5, 1, 3, 8, 6, 9 };
        analyzeNumbers(arr);
    }

    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum is " + arr[0]);
        System.out.println("Maximum is " + arr[arr.length - 1]);
        int sum = 0;
        for (Integer number : arr) {
            sum += number;
        }
        int average = sum / arr.length;
        System.out.println("Average is = " + average);

    }
}
