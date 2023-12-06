// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {
    public static boolean bracketsCheck(String exampleStr) {
        Map<Character, Character> brakets = getBrakets();
        Stack<Character> openBrakets = new Stack<>();
        for (Character ch : exampleStr.toCharArray()) {
            if (brakets.containsValue(ch)) {
                openBrakets.push(ch);
            } else if (brakets.containsKey(ch)) {
                if (brakets.isEmpty()) {
                    return false;
                } else {
                    if (!brakets.get(ch).equals(openBrakets.pop())) {
                        return false;
                    }
                }
            }
        }

        return openBrakets.isEmpty();
    }

    private static Map<Character, Character> getBrakets() {
        Map<Character, Character> brakets = new HashMap<>();
        brakets.put('}', '{');
        brakets.put(']', '[');
        brakets.put('>', '<');
        brakets.put(')', '(');

        return brakets;
    }

    public static void main(String[] args) {
        String[] examples = { "a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}" };
        for (int i = 0; i < examples.length; i++) {
            System.out.println(examples[i] + " -> " + bracketsCheck(examples[i]));
        }
    }
}