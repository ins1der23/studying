import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveEven {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { -1, 1, 2, 4, 6, 9, 8 };
        System.out.println(Arrays.toString(arr));
        removeEvenNumbers(arr);

    }

    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (Integer number : arr) {
            temp.add(number);
        }
        Iterator<Integer> iterator = temp.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0)
                iterator.remove();
        }
        System.out.println(temp);
    }
}
