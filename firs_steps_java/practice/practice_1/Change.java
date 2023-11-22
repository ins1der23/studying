// 📌 Дан массив nums = [3,2,2,3] и число val = 3.
// 📌 Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// 📌 Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        int[] someArray = { 3, 2, 2, 3, 2 };
        toTheEnd(3, someArray);
        System.out.println(Arrays.toString(someArray));

    }

    static void toTheEnd(int number, int[] array) {
        int temp;
        int last = array.length - 1;
        int i = 0;
        while (array[i] != number) {
            if (array[i] == number) {
                temp = array[i];
                array[i] = array[last];
                array[last] = temp;
            }

        }
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] == number) {
                temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
            }
        }
    }
}
