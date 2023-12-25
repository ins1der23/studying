package Service.Iterators;

import java.util.Iterator;
import java.util.List;

import Domain.StudentGroup;

/**
 * Итератор для StudentGroups
 */
public class GroupIterator implements Iterator<StudentGroup> {
    private int counter; // счетчик элементов в списке
    private final List<StudentGroup> studentGroups; // список групп студентов

    public GroupIterator(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        return studentGroups.get(counter++);
    }

}
