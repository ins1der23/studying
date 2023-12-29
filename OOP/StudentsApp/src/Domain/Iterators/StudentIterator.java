package Domain.Iterators;

import java.util.Iterator;
import java.util.List;

/**
 * Итератор для StudentCollection
 */
public class StudentIterator<N extends Number, T> implements Iterator<T> {
    private int counter;
    private final List<T> students;

    public StudentIterator(List<T> students) {
        this.students = students;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        return students.get(counter++);
    }

}