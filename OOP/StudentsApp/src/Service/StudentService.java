package Service;

import java.util.List;

import Domain.Student;
import Service.Interfaces.IPersonCreate;

/**
 * класс для сервисов Student
 */
public class StudentService<N extends Number> extends PersonService<N, Student<N>> implements IPersonCreate<N> {

    public StudentService(List<Student<N>> persons) {
        super();
        if (persons != null)
            super.persons.addAll(persons);
        super.counter = 0;
    }

    /**
     * Переопределение create для создания и добавления в список, age принмает любой числовой тип
     */
    @Override
    public void create(String name, N age, String param) {
        Student<N> student = new Student<N>(name, age);
        persons.add(student);
        super.counter++;
    }

}
