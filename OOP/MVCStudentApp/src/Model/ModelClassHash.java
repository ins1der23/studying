package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

// модель для работы с HashMap
public class ModelClassHash implements iGetModel {

    private HashMap<Integer, Student<Number>> students;

    // Конструктор
    public ModelClassHash() {
        students = new HashMap<>();
    }

    // добавить студента в HashMap, устанавливает id студента в качестве ключа
    public void addStudent(Student<Number> student) {
        students.put(student.getId(), student);
    }

    // получить список студентов
    @Override
    public List<Student<Number>> getStudents() {
        List<Student<Number>> output = new ArrayList<>();
        for (Student<Number> student : students.values()) {
            output.add(student);
        }
        return output;
    }

    // метод удаления студента по ID, возвращает true в случае удаления
    @Override
    public boolean deleteStudent(Integer id) {
        Student<Number> result = students.remove(id);
        if (result == null)
            return false;
        return true;
    }
}
