public class HeapSort {

    public static void buildTree(int[] tree, int sortLength, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < sortLength && tree[left] > tree[largest]) {
            largest = left;
        }
        if (right < sortLength && tree[right] > tree[largest]) {
            largest = right;
        }
        if (largest != i) {
            int tmp = tree[i];
            tree[i] = tree[largest];
            tree[largest] = tmp;
            buildTree(tree, sortLength, largest);
        }

    }

    public static void heapSort(int[] sortArray, int sortLength) {
        if (sortLength == 0) {
            return;
        }

        int length = sortLength;

        for (int i = length / 2 - 1; i >= 0; i--) {
            buildTree(sortArray, length, i);
        }
        for (int i = length - 1; i >= 0; i--) {
            int tmp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = tmp;
            buildTree(sortArray, i, 0);
        }
    }
}
