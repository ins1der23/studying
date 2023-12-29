package Service;

import java.util.ArrayList;
import java.util.List;

import Domain.Person;
import Domain.Iterators.PersonComparator;
import Service.Interfaces.IPersonService;

/**
 * Абстрактный родительский класс для сервисов ролей (EmployeeService,
 * StudentService, TeacherService)
 */
public abstract class PersonService<N extends Number, T extends Person<N>>
        implements IPersonService<N, T> {

    protected int counter; // счетчик для списка экземпляров Person
    protected List<T> persons; // список экземпляров наследников класса Person

    /**
     * Конструктор
     * 
     * @param persons список экземпляров наследников класса Person
     */
    public PersonService(List<T> persons) {
        this.persons = new ArrayList<T>();
        if (persons != null)
            this.persons.addAll(persons);
    }

    /**
     * Геттер counter
     */
    public int getCounter() {
        return counter;
    }

    /**
     * Метод сортиhовки по списка по имени
     */
    public void sortByName() {
        PersonComparator<N, Person<N>> comparator = new PersonComparator<>();
        persons.sort(comparator);
    }

    /**
     * Получения списка экземпляров наследников класса Person
     */
    public List<T> getAll() {
        return persons;
    }

    /**
     * Создать экземпляр наследника класса Person
     */
    public abstract T create(String name, N age, String param);
    

}
