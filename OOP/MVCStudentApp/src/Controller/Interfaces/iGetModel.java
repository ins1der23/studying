package Controller.Interfaces;

import java.util.List;

import Model.Core.Student;

public interface iGetModel {

    //получить список студентов
    public List<Student<Number>> getStudents();

    // удалить студента по ID
    boolean deleteStudent(Integer id);

}
