import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = false;
        while (!flag) {
            flag = iScanner.hasNextInt();

        }

        // int i = iScanner.nextInt();
        // System.out.println(i);
        iScanner.close();
    }

}
