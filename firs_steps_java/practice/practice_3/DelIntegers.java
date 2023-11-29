// 📌 Создать список типа ArrayList<String>.
// 📌 Поместить в него как строки, так и целые числа.
// 📌 Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class DelIntegers {

    /**
     * @param array
     * @return
     */
    static List<String> removeNumbers(List<String> array) {
        Iterator<String> iterator = array.iterator();
        while (iterator.hasNext()) {
            if (isNumber(iterator.next()))
                iterator.remove();

        }
        return array;
    }

    private static Boolean isNumber(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    static void getList(List<String> array) {
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("5");
        array.add("7");
        array.add("12");
        array.add("3");
        array.add("ada");
    }

    public static void main(String[] args) {
        List<String> arrayString = new ArrayList<>();
        getList(arrayString);
        System.out.println(arrayString);
        System.out.println(removeNumbers(arrayString));

    }
}
