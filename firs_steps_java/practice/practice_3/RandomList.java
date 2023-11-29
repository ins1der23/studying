// 📌 Заполнить список десятью случайными числами.
// 📌 Отсортировать список методом sort() и вывести его на
// экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomList {

    public static void main(String[] args) {
        ArrayList<Integer> someList = getRandomList(10);
        System.out.println(someList);
        Collections.sort(someList);
        System.out.println(someList);
    }

    private static ArrayList<Integer> getRandomList(int size) {
        ArrayList<Integer> someList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            someList.add(random.nextInt(1, 100));
        }
        return someList;
    }
}