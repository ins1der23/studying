import java.util.LinkedList;

public class MyQueue<T> {

    LinkedList<T> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.add(queue.size(), element);
    }

    public T dequeue() {
        return queue.pop();
    }

    public T first() {
        return queue.getFirst();
    }

    public LinkedList<T> getElements() {
        return queue;
    }

    public static void main(String[] args) {
        MyQueue<Object> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);
        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }

}