// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

public class Numbers {
    public static void main(String[] args) {
        int[] numbers = { 1, 1, 0, 1, 1, 1 };
        System.out.println(getSequence(numbers));
    }

    static int getSequence(int[] numbers) {
        int count = 0;
        int sequence = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                count++;
                sequence = count < sequence ? sequence : count;
            } else
                count = 0;
        }
        return sequence;
    }
}
