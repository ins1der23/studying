import java.util.ArrayList;
import java.util.Scanner;

public class Common {

    public static int getInteger(String invite) {
        int result = 0;
        boolean flag = true;
        while (flag) {
            try (Scanner scanner = new Scanner(System.in)) {
                result = Integer.parseInt(scanner.nextLine());
                flag = false;
            } catch (Exception e) {
                System.out.println(Messages.inputError);
            }
        }
        return result;
    }

    public static int getInteger(int min, int max) {
        int result = 0;
        boolean flag = true;
        while (flag || min > result || max < result) {
            try (Scanner scanner = new Scanner(System.in)) {
                result = Integer.parseInt(scanner.nextLine());
                flag = false;
            } catch (Exception e) {
                System.out.println(Messages.inputError);
            }
        }
        return result;
    }

    public static void showStringList(ArrayList<String> options) {
        System.out.print("\033[H\033[2J");
        int i = 1;
        for (String option : options) {
            System.out.println(i + "." + option);
            i++;
        }
    }

    public void ShowMenu(String name, ArrayList<String> options, boolean clear) {
        if (clear) {
            System.out.print("\033[H\033[2J");
        }
        System.out.println(name);
        int i = 1;
        for (String option : options) {
            System.out.println(i + "." + option);
            i++;
        }
    }

    public int getChoice(String name, ArrayList<String> options, String invite) {
        ShowMenu(name, options, false);
        System.out.println(invite);
        return getInteger(0, options.size());
    }

}
