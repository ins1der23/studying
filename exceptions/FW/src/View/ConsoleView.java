package View;

import java.util.Scanner;

/**
 * Класс, отвечающий за консольный интерфейс пользователя
 */
public class ConsoleView implements iView {

    /**
     * Переменная для получения данных от пользователя
     */
    Scanner in;

    /**
     * Конструткор, устанавливающий кодировку для ввода с клавиатуры
     */
    public ConsoleView() {
        in = new Scanner(System.in, "cp866");
    }

    @Override
    public String getString(String invite, Boolean clear) {
        if (clear)
            clearConsole();
        System.out.println(invite);
        String output = in.nextLine();
        return output;
    }

    @Override
    public void showString(String message, Boolean clear) {
        if (clear)
            clearConsole();
        System.out.println(message);
    }

    // пауза
    @Override
    public void pressEnter(String invite) {
        System.out.println(invite);
        in.nextLine();
        return;
    }

    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
    }

}
