import java.util.LinkedList;
import java.util.Stack;
import java.util.Iterator;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        Stack<Object> stack = new Stack<>();
        Iterator<Object> iterator = ll.iterator();
        while (iterator.hasNext()) {
            stack.push(iterator.next());
            iterator.remove();
        }
        iterator = stack.iterator();
        while (iterator.hasNext()) {
            ll.add(stack.pop());
        }
        return ll;
    }

    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        LLTasks answer = new LLTasks();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }
}
