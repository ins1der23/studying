import java.util.HashMap;
import java.util.Map;

//Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
//        и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
//        некоторую букву во втором слове, при этом
//        1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
//        порядка следования. (Например, add - egg изоморфны)
//        2. буква может не меняться, а остаться такой же. (Например, note - code)
//        Пример 1:
//        Input: s = "foo", t = "bar"
//        Output: false
//        Пример 2:
//        Input: s = "paper", t = "title"
//        Output: true
public class CheckIsomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "egg"));

    }
    public static boolean isIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        if (str1.equals(str2)) return true;

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char charS1 = str1.charAt(i);
            char charS2 = str2.charAt(i);

            if (map.containsKey(charS1)) {
                if (map.get(charS1) != charS2) {
                    return false;
                }
            }
            else if(map.containsValue(charS2)) {
                return false;
            }
            else {
                map.put(charS1, charS2);
            }

        }
        return true;
    }
}