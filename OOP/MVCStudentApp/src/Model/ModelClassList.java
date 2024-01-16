package Model;

import java.util.Iterator;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

// модель для работы с List
public class ModelClassList implements iGetModel {
    private List<Student<Number>> students;

    //Конструктор
    public ModelClassList(List<Student<Number>> students) {
        this.students = students;
    }

    // получить список студентов
    public List<Student<Number>> getStudents() {
        return students;
    }

    // метод удаления студента по ID, возвращает true в случае удаления
    public boolean deleteStudent(Integer id) {
        boolean result = false;
        Iterator<Student<Number>> iter = students.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == id) {
                iter.remove();
                result = true;
            }
        }
        return result;
    }
}
