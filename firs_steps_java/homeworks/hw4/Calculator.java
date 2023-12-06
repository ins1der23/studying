import java.util.Stack;

class Calculator {
    Stack<Integer> stack;
    Integer result;

    public Calculator() {
        stack = new Stack<Integer>();
    }

    public int calculate(char op, int a, int b) {
        switch (op) {
            case '+':
                result = a + b;
                stack.push(result);
                break;
            case '-':
                result = a - b;
                stack.push(result);
                break;
            case '*':
                result = a * b;
                stack.push(result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Некорректный оператор: " + b);
                } else
                    result = (int) a / b;
                stack.push(result);
                break;
            case '<':
                stack.pop();
                result = stack.peek();
                break;
        }
        return result;
    }

     public static void main(String[] args) {
        int a = 3;
        char op = '+';
        int b = 7;
        int c = 4;
        char op2 = '+';
        int d = 7;
        char undo = '<';
        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);

    }
}

