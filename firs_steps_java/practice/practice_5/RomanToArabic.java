//Написать метод, который переведет число из римского формата записи в арабский.
//        Например, MMXIX = 2019
//        'I', 1
//        'V', 5
//        'X', 10
//        'L', 50
//        'C', 100
//        'D', 500
//        'M', 1000


import java.util.HashMap;
import java.util.Map;

public class RomanToArabic {
    public static void main(String[] args) {
        String romanNumber = "MMXXIV";
        System.out.println(romanToArabic(romanNumber));

    }
    private static Map<Character, Integer> mapRomanAndArabic() {
        Map<Character, Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);

        return numbers;
    }
    public static int romanToArabic(String romanNums) {
        Map<Character, Integer> numbers = mapRomanAndArabic();

        int result  = 0;
        int prev = 0;

        for (int i = romanNums.length() - 1; i >= 0; i--) {
            int curNumber = numbers.get(romanNums.charAt(i));


            if(curNumber < prev) {
                result -= curNumber;
            }
            else {
                result += curNumber;
            }
            prev = curNumber;
        }
        return result;
    }
}
