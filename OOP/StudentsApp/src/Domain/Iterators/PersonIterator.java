package Domain.Iterators;

import java.util.Iterator;
import java.util.List;

/**
 * Итератор для StudentCollection
 */
public class PersonIterator<N extends Number, T> implements Iterator<T> {
    private int counter;
    private final List<T> persons;

    public PersonIterator(List<T> persons) {
        this.persons = persons;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < persons.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        return persons.get(counter++);
    }

}