package Domain.Iterators;

import java.util.Comparator;

import Domain.Person;

public class PersonComparator<N extends Number, T extends Person<N>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        if (o1.getName().compareTo(o2.getName()) == 0)
            return 0;
        else
            return o1.getName().compareTo(o2.getName());
    }
}
