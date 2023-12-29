package Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Domain.Person;
import Domain.Iterators.PersonComparator;
import Domain.Iterators.PersonIterator;
import Service.Interfaces.IPersonService;

/**
 * Родительский класс для сервисов ролей (EmployeeService,
 * StudentService, TeacherService)
 */
public class PersonService<N extends Number, T extends Person<N>> implements IPersonService<T>, Iterable<T> {

    protected int counter; // счетчик для списка экземпляров Person
    protected List<T> persons; // список экземпляров наследников класса Person

    /**
     * Конструктор без параметров
     * 
     */
    public PersonService() {
        this.persons = new ArrayList<>();
    }

    /**
     * Геттер counter
     */
    public int getCounter() {
        return counter;
    }

    /**
     * Получение списка экземпляров наследников класса Person
     */
    public List<T> getAll() {
        return persons;
    }

    /**
     * Метод сортировки по списка по имени
     */
    public void sortByName() {
        PersonComparator<N, T> comparator = new PersonComparator<>();
        persons.sort(comparator);
    }

    /**
     * Добавление элемента в список экземпляров наследников класса Person
     */
    public void addPerson(T person) {
        persons.add(person);
        counter++;
    }

    /**
     * Получение элемента списка экземпляров наследников класса Person
     */
    public T getAt(int position) {
        return persons.get(position - 1);
    }


    /**
     * Переопределиние toString
     */
    @Override
    public String toString() {
        String output = new String();
        for (T item : persons) {
            output += item.toString() + "\n";
        }
        return output;
    }

    /**
     * Итератор для Person
     */
    @Override
    public Iterator<T> iterator() {
        return new PersonIterator<N, T>(persons);
    }

}
