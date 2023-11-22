public class simpleNums {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if (simple_num_check(i))
                System.out.println(i);
        }
    }

    static boolean simple_num_check(int toCheck) {
        int temp = 0;
        for (int i = 2; i < toCheck; i++) {
            temp = toCheck % i;
            if (temp == 0)
                return false;
        }
        return true;
    }

}
