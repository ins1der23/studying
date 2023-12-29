package Service;

import java.util.List;

import Domain.Student;

public class StudentService<N extends Number> extends PersonService<N, Student<N>> {

    public StudentService(List<Student<N>> students) {
        super(students);
        super.counter = 0;
    }

    @Override
    public Student<N> create(String name, N age, String param) {
        Student<N> student = new Student<N>(name, age);
        persons.add(student);
        super.counter++;
        return student;
    }

    
}
