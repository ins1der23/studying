// 📌 Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).



public class Palindrom {
    public static void main(String[] args) {
        String someString = "annan";
        System.out.println(isPalindrom(someString));

    }

    public static boolean isPalindrom(String someString) {
        for (int i = 0; i < someString.length() / 2; i++) {
            if (someString.charAt(i) != someString.charAt(someString.length() - 1 - i))
                return false;
        }
        return true;
    }
}
