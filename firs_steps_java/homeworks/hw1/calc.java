import java.util.Scanner;

public class calc {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int first = get_integer("Введите первое число:");
        char action = get_action("Введите арифметическое действие: ");
        int second = get_integer("Введите второе число:");
        System.out.println(
                String.format("%1$s %2$s %3$s = %4$s", first, action, second, calculate(action, first, second)));
        in.close();

    }

    static int get_integer(String message) {
        String temp = "";
        boolean isInt = false;
        while (!isInt) {
            System.out.println(message);
            ;
            temp = in.nextLine();
            try {
                Integer.parseInt(temp);
                isInt = true;
            } catch (NumberFormatException e) {
                isInt = false;
            }
        }
        return Integer.parseInt(temp);
    }

    static char get_action(String message) {
        char temp;
        String actions = "+-*/";
        while (true) {
            System.out.println(message);
            temp = in.nextLine().charAt(0);
            if (actions.contains(String.valueOf(temp))) {
                return temp;
            }
        }
    }

    static int calculate(char op, int a, int b) {
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Некорректный оператор: " + b);
                } else
                    result = (int) a / b;
                break;
        }
        return result;
    }
}
