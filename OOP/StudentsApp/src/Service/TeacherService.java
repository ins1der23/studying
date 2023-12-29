package Service;

import java.util.List;

import Domain.Teacher;
import Service.Interfaces.IPersonCreate;

/**
 * класс для сервисов Teacher
 */
public class TeacherService<N extends Number> extends PersonService<N, Teacher<N>> implements IPersonCreate<N> {

    public TeacherService(List<Teacher<N>> persons) {
        super();
        if (persons != null)
            super.persons.addAll(persons);
        super.counter = 0;
    }

    public List<Teacher<N>> getSorted() {
        sortByName();
        return persons;
    }

    /**
     * Переопределение create для создания и добавления в список, age принмает любой числовой тип
     */
    @Override
    public void create(String name, N age, String acadDegree) {
        Teacher<N> teacher = new Teacher<>(name, age, acadDegree);
        super.persons.add(teacher);
        super.counter++;
    }

}
