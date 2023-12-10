// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
// цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и
// верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.

import java.util.HashSet;
import java.util.Random;

public class PercentUniqueNum {
    public static void main(String[] args) {

    }

    public static int[] getRandomArray(int size, int min, int max) {
        int[] randomArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(min, max);
        }
        return randomArray;
    }

    public static double getPercentUnique(int[] randomArray) {
        double percentage = 0;
        HashSet<Integer> uniquSet = new HashSet<>();
        for (Integer integer : randomArray) {
            uniquSet.add(integer);
        }
        percentage = uniquSet.size() * 100 / randomArray.length;
        return percentage;
    }

}