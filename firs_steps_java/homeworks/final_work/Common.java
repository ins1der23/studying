import java.util.Scanner;

public class Common {
    static Scanner scanner = new Scanner(System.in);

    // очистка консоли
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
    }

    // получение int с клавиатуры
    public static int getInteger(String invite, boolean clear) {
        int output = 0;
        boolean flag = true;
        do {
            showString(invite + ":", clear);
            String temp = scanner.nextLine();
            if (temp.equals(new String()))
                temp = "0";
            try {
                output = Integer.parseInt(temp);
                flag = false;
            } catch (Exception e) {
                System.out.println(Messages.inputError);
            }
        } while (flag);
        return output;
    }
    

    // получение int с клавиатуры в заданном диапазоне
    public static int getInteger(String invite, int min, int max, boolean clear) {
        int output = 0;
        boolean flag = true;
        do {
            showString(invite + ":", clear);
            String temp = scanner.nextLine();
            if (temp.equals(new String()))
                temp = "0";
            try {
                output = Integer.parseInt(temp);
                flag = false;
            } catch (Exception e) {
                System.out.println(Messages.inputError);
            }
        } while (flag || min > output || max < output);
        return output;
    }

    // проверка возможности парсинга String в Int
    public static boolean tryParseInt(String someString) {
        try {
            Integer.parseInt(someString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // получение String с клавиатуры
    public static String getString(String invite, boolean clear) {
        showString(invite, clear);
        String output = scanner.nextLine();
        return output;
    }

    // пауза
    public static void pressEnter(String invite) {
        showString(invite, false);
        scanner.nextLine();
        return;
    }

    // показ String с возможностью очитски консоли
    public static void showString(String someString, boolean clear) {
        if (clear) {
            clearConsole();
        }
        System.out.println(someString);
    }

    // оформление меню
    private static void showMenu(String name, String[] options, boolean clear) {
        if (clear) {
            clearConsole();
        }
        System.out.println(name + "\n");
        int i = 1;
        for (String option : options) {
            System.out.println(i + "." + option);
            i++;
        }
        System.out.println();
    }

    // возврат int выбора пунтка меню
    public static int getChoiceFromMenu(String name, String[] options, String invite, boolean clear, boolean noNull) {
        int min = noNull ? 1 : 0;
        showMenu(name, options, clear);
        return getInteger(invite, min, options.length, false);
    }

}
