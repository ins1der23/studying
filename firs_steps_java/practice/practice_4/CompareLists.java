import java.util.ArrayList;
import java.util.LinkedList;

public class CompareLists {
    public static void main(String[] args) {
        int count = 200000;
        System.out.println("Добавление в конец");
        long start = System.currentTimeMillis();
        getArrayList(count);
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        getLinkedList(count);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println("Добавление в начало");
        start = System.currentTimeMillis();
        getArrayListFirst(count);
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        getLinkedListFirst(count);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println("Добавление в середину");
        start = System.currentTimeMillis();
        getArrayListMiddle(count);
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        getLinkedListMiddle(count);
        System.out.println(System.currentTimeMillis() - start);

    }

    public static ArrayList<Integer> getArrayList(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int index = 0; index < count; index++) {
            arrayList.add(arrayList.size(), index);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedList(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int index = 0; index < count; index++) {
            linkedList.addLast(index);
        }
        return linkedList;
    }

    public static ArrayList<Integer> getArrayListFirst(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int index = 0; index < count; index++) {
            arrayList.add(0, index);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListFirst(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int index = 0; index < count; index++) {
            linkedList.addFirst(index);
        }
        return linkedList;
    }

    public static ArrayList<Integer> getArrayListMiddle(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int index = 0; index < count; index++) {
            arrayList.add(arrayList.size() / 2, index);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListMiddle(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int index = 0; index < count; index++) {
            linkedList.add(linkedList.size() / 2, index);
        }
        return linkedList;
    }
}
