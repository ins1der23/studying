// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

// Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:

// int[] arr - числовой массив

// После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays;

public class LogBubbleSort {
    private static File log = new File("log.txt");
    private static FileWriter fileWriter;

    public static void main(String[] args) {
        int[] mas = new int[] { 9, 4, 8, 3, 1 };
        bubbleSort(mas);
    }

    public static void bubbleSort(int[] mas) {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        StringBuilder sb = new StringBuilder();
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                    sorted = false;
                }
            }
            Date date = new Date();
            sb.append(formater.format(date)).append(" ").append(Arrays.toString(mas)).append("\n");
            try (FileWriter fileWriter = new FileWriter(log)) {
                fileWriter.append(sb);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
