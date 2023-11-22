// 📌 Во фразе "Добро пожаловать на курс по Java" переставить слова
// в обратном порядке

public class Phrase {

    public static void main(String[] args) {
        String line = "Добро пожаловать";
        System.out.println(reverse(line));
    }

    static String reverse(String line) {
        String[] temp = line.split(" ");
        String result = "";
        for (int i = temp.length - 1; i >= 0; i--) {
            result += temp[i] + " ";
        }
        return result;
    }
    }
