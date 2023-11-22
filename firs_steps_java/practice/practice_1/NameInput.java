// 📌 Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// 📌 Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

import java.util.Scanner;

public class NameInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "ibm866");
        System.out.println("Input your name");
        String name = scanner.nextLine();
        System.out.println("Имя " + name + "!");
        scanner.close();
    }
}
