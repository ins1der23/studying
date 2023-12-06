import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 44, 78, 65, 2, 35, 8, 0, 12, 32 };
        mergeSort(a);
    }

    public static void mergeSort(int[] a) {
        if (a == null) {
            return;
        }
        int length = a.length;
        if (length < 2) {
            return;
        }
        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];
        for (int i = 0; i < middle; i++) {
            left[i] = a[i];
        }
        for (int i = middle; i < length; i++) {
            right[i - middle] = a[i];
        }
        mergeSort(left);
        mergeSort(right);
        mergeArray(a, left, right);
    }

    public static void mergeArray(int[] a, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < left.length) {
            a[k++] = left[i++];
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }
}
