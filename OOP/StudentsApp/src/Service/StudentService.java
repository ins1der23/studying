package Service;

import java.util.List;

import Domain.Student;
import Service.Interfaces.IPersonCreate;

public class StudentService<N extends Number> extends PersonService<N, Student<N>> implements IPersonCreate<N> {

    public StudentService(List<Student<N>> persons) {
        super();
        if (persons != null)
            super.persons.addAll(persons);
        super.counter = 0;
    }

    @Override
    public void create(String name, N age, String param) {
        Student<N> student = new Student<N>(name, age);
        persons.add(student);
        super.counter++;
    }

    @Override
    public String toString() {
        String output = new String();
        for (Student<N> item : persons) {
            output += item.toString() + "\n";
        }
        return output;
    }

}
