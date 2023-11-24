// 📌 Напишите метод, который сжимает строку.
// 📌 Пример: вход aaaabbbcdd.
// результат a4b3c1d2.

package practice_2;

public class CompressStrng {
    public static void main(String[] args) {
        String someString = "aaaabbbcdd";
        System.out.println(Compress(someString));
    }

    public static String Compress(String someString) {
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        for (int i = 1; i < someString.length(); i++) {
            if (someString.charAt(i) == someString.charAt(i - 1)) {
                counter++;
            } else {
                sb.append(someString.charAt(i - 1)).append(counter);
                counter = 1;
            }
        }
        sb.append(someString.charAt(someString.length()-1)).append(counter);
        return sb.toString();
    }
}
