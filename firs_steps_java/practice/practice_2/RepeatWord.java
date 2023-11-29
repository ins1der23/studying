// 📌 Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.



import java.io.FileWriter;
import java.io.IOException;

public class RepeatWord {
    public static void main(String[] args) {
        String repeated  = getWord("test", 100);
        writeToFile(repeated, "repeated.txt");
    }

    static String getWord(String word, int repeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(word).append(" ");
        }
        return sb.toString();
    }

    static void writeToFile(String toWrite, String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(toWrite);
            System.out.println("SUCCESS");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("FAIL");
        }
    }

}
