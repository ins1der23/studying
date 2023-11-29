// 📌 Дано четное число N (>0) и символы c1 и c2.
// 📌 Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.



public class RepeatingSymbols {
    public static void main(String[] args) {
        char c1 = 'm';
        char c2 = 'a';
        int n = 500000;
        long start = System.currentTimeMillis();
        alternatingCharsSB(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        alternatingCharsStr(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static String alternatingCharsSB(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);            
        }
        return sb.toString();
    }

    public static String alternatingCharsStr(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n / 2; i++) {
            str+=Character.toString(c1) + Character.toString(c2);            
        }
        return str;
    }
}
