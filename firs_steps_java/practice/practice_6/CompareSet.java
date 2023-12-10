// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
// 6, 3}. Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CompareSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(3, 6, 43, 8, 11, 33, 6, 3, 8));
        System.out.println(hashSet);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(3, 6, 43, 8, 11, 33, 6, 3, 8));
        System.out.println(linkedHashSet);
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(3, 6, 43, 8, 11, 33, 6, 3, 8));
        System.out.println(treeSet);
    }
}
