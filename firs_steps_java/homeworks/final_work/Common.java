import java.util.ArrayList;
import java.util.Scanner;

public class Common {
    static Scanner scanner = new Scanner(System.in);

    public static int getInteger(String invite) {
        int result = 0;
        boolean flag = true;
        System.out.print("\033[H\033[2J");
        while (flag) {
            showString(invite + ":", false);
            String temp = scanner.nextLine();
            try {
                result = Integer.parseInt(temp);
                flag = false;
            } catch (Exception e) {
                System.out.println(Messages.inputError);
            }
        }
        return result;
    }

    public static int getInteger(String invite, int min, int max) {
        int output = 0;
        boolean flag = true;
        do {
            System.out.println(invite + ":");
            String temp = scanner.nextLine();
            try {
                output = Integer.parseInt(temp);
                flag = false;
            } catch (Exception e) {
                System.out.println(Messages.inputError);
            }
        } while (flag || min > output || max < output);
        return output;
    }

    public static String getString(String invite) {
        showString(invite, true);
        String output = scanner.nextLine();
        return output;
    }
    public static void pressEnter(String invite) {
        showString(invite, false);
        scanner.nextLine();
        return;
    }

    public static void showString(String someString, boolean clear) {
        if (clear) {
            System.out.print("\033[H\033[2J");
        }
        System.out.println(someString);
    }

    public static void showStringList(ArrayList<String> options) {
        System.out.print("\033[H\033[2J");
        int i = 1;
        for (String option : options) {
            System.out.println(i + "." + option);
            i++;
        }
    }

    public static void showMenu(String name, String[] options, boolean clear) {
        if (clear) {
            System.out.print("\033[H\033[2J");
        }
        System.out.println(name + "\n");
        int i = 1;
        for (String option : options) {
            System.out.println(i + "." + option);
            i++;
        }
        System.out.println();
    }

    public static int getChoiceFromMenu(String name, String[] options, String invite, boolean clear) {
        showMenu(name, options, clear);
        return getInteger(invite, 1, options.length);
    }

}
