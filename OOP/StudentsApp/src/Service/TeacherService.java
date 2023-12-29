package Service;

import java.util.List;

import Domain.Teacher;

public class TeacherService extends PersonService<Integer, Teacher> {

    public TeacherService(List<Teacher> persons) {
        super(persons);
        super.counter = 0;
    }

    public List<Teacher> getSorted() {
        sortByName();
        return persons;
    }

    @Override
    public Teacher create(String name, Integer age, String acadDegree) {
        Teacher teacher = new Teacher(name, age, acadDegree);
        super.persons.add(teacher);
        super.counter++;
        return teacher;
    }

    @Override
    public String toString() {
        String output = new String();
        for (Teacher teacher : persons) {
            output += teacher.toString() + "\n";
        }
        return output;
    }

}
