package InOut;

import java.util.Scanner;

public class InOut {

    static Scanner scanner = new Scanner(System.in);

    // вывод в консоль
    public static void showString(String message) {
        System.out.println(message);
    }
    public static void showSeparator(){
        System.out.println("=============================================");
    }
    

    // очистка консоли
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
    }

    // пауза
    public static void pressEnter() {
        System.out.println("Нажмите Enter для продолжения... ");
        scanner.nextLine();
        return;
    }
}
