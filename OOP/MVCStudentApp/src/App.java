import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassFile;
import Model.ModelClassHash;
import Model.ModelClassList;
import Model.Core.Student;
import View.ViewClass;
import View.Text.TextEng;
import View.Text.TextRus;

public class App {
    public static void main(String[] args) throws Exception {
        // Студенты
        Student<Number> s1 = new Student<Number>("Ваня", 21);
        Student<Number> s2 = new Student<Number>("Вася", 22);
        Student<Number> s3 = new Student<Number>("Петя", 18);
        Student<Number> s4 = new Student<Number>("Коля", 19);
        Student<Number> s5 = new Student<Number>("Маша", 18);
        Student<Number> s6 = new Student<Number>("Ирина", 19);
        Student<Number> s7 = new Student<Number>("Диана", 20);
        Student<Number> s8 = new Student<Number>("Света", 20);
        Student<Number> s9 = new Student<Number>("Вазген", 29);
        Student<Number> s10 = new Student<Number>("Катя", 21);
        Student<Number> s11 = new Student<Number>("Миша", 19);
        Student<Number> s12 = new Student<Number>("Настя", 23);
        Student<Number> s13 = new Student<Number>("Костя", 25);
        Student<Number> s14 = new Student<Number>("Ася", 23);

        // Список студентов для модели List
        List<Student<Number>> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);

        // Модель Hash
        ModelClassHash modelHash = new ModelClassHash();
        modelHash.addStudent(s8);
        modelHash.addStudent(s9);
        modelHash.addStudent(s10);
        modelHash.addStudent(s11);
        modelHash.addStudent(s12);
        modelHash.addStudent(s13);
        modelHash.addStudent(s14);
        // Файловая модель
        iGetModel modelFile = new ModelClassFile("StudentDB.csv");
        // Модель List
        iGetModel modelList = new ModelClassList(students);

        // HashMap моделей
        Map<String, iGetModel> models = new HashMap<>();
        models.put("LIST", modelList);
        models.put("FILE", modelFile);
        models.put("HASH", modelHash);

        // Экземпляры View для различных языков интерфейса
        iGetView viewSimpleRu = new ViewClass(new TextRus());
        iGetView viewSimpleEng = new ViewClass(new TextEng());

        // HashMap View для языков интерфейса
        Map<String, iGetView> views = new HashMap<>();
        views.put("RUS", viewSimpleRu);
        views.put("ENG", viewSimpleEng);

        // Запуск программы
        ControllerClass controller = new ControllerClass(models, views);

        controller.run();

    }
}
