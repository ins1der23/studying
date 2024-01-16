package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;
import Service.CommonMethods;

//модель для работы с файлами

public class ModelClassFile implements iGetModel {

    // имя файла для работы
    private String fileName;

    // конструткор принимает String с именем файла
    public ModelClassFile(String fileName) {
        this.fileName = fileName;

        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // получить список студентов
    @Override
    public List<Student<Number>> getStudents() {
        List<Student<Number>> students = new ArrayList<Student<Number>>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] param = line.split(" ");
                Student<Number> pers = new Student<Number>(param[0], Integer.parseInt(param[1]),
                        Integer.parseInt(param[2]));
                students.add(pers);
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    // метод сохранения в файл всех студентов в списке
    public void saveAllStudentToFile(List<Student<Number>> students) {
        try (FileWriter fw = new FileWriter(fileName, false)) {
            for (Student<Number> pers : students) {
                fw.write(pers.getName() + " " + pers.getAge() + " " + pers.getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // метод сохранения в файл уникальных значений из списка
    public void saveUniqueStudentToFile(List<Student<Number>> students) {
        List<Student<Number>> toSave = CommonMethods.makeUnique(students);
        try (FileWriter fw = new FileWriter(fileName, false)) {
            for (Student<Number> pers : toSave) {
                fw.write(pers.getName() + " " + pers.getAge() + " " + pers.getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // метод удаления студента по ID, возвращает true в случае удаления
    @Override
    public boolean deleteStudent(Integer id) {
        boolean result = false;
        List<Student<Number>> students = getStudents();
        Iterator<Student<Number>> iter = students.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == id) {
                iter.remove();
                result = true;
            }
        }
        if (result) {
            saveUniqueStudentToFile(students);
            return result;
        }
        return result;
    }
}
