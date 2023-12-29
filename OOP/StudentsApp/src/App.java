import java.util.ArrayList;

import Controller.AccountController;
import Domain.Employee;
import Domain.Person;
import Domain.Student;
import Domain.Teacher;
import Domain.Collections.StudentGroup;
import Domain.Collections.StudentStream;
import Service.EmployeeService;
import Service.PersonService;
import Service.StudentService;
import Service.TeacherService;
import InOut.InOut;

public class App {
    public static void main(String[] args) throws Exception {

        InOut.clearConsole();
        InOut.showString("Создаем студентов...");
        InOut.pressEnter();
        StudentService<Number> students = new StudentService<>(null);
        students.create("Иван", 25, null);
        students.create("Игорь", 23.5F, null);
        students.create("Иван", 25.7, null);
        students.create("Игорь", 23, null);
        students.create("Даша", 22, null);
        students.create("Лена", 20, null);
        students.create("Вася", 19.5F, null);
        students.create("Петя", 18, null);
        students.create("Маша", 51.5, null);
        students.create("Лена", 24, null);
        students.create("Лиза", 19, null);
        students.create("Альбина", 21.5, null);
        students.create("Аня", 24.2, null);
        InOut.showString(students.toString());
        InOut.showSeparator();
        InOut.pressEnter();

        InOut.clearConsole();
        InOut.showString("Создаем преподавателей...");
        InOut.pressEnter();
        TeacherService<Number> teachers = new TeacherService<>(null);
        teachers.create("Евгений Иванович", 50, "Доцент");
        teachers.create("Иван Васильевич", 55, "Профессор");
        teachers.create("Анна Петровна", 34, "Кандидат наук");
        teachers.create("Полина Сергеевна", 35, "Доктор наук");
        InOut.showString(teachers.toString());
        InOut.showString("Сортируем преподователей...");
        InOut.pressEnter();
        teachers.sortByName();
        InOut.showString(teachers.toString());
        InOut.showSeparator();
        InOut.pressEnter();

        InOut.clearConsole();
        InOut.showString("Создаем работников...");
        InOut.pressEnter();
        EmployeeService<Number> employees = new EmployeeService<>(null);
        employees.create("Василий", 27.7, "Монтёр");
        employees.create("Маргарита Семеновна", 52.3, "Повар");
        employees.create("Павел Иваныч", 45.2, "Зав. склада");
        InOut.showString(employees.toString());
        InOut.showSeparator();
        InOut.pressEnter();

        InOut.clearConsole();
        InOut.showString("Формируем общий список...");
        InOut.pressEnter();
        PersonService<Number, Person<Number>> persons = new PersonService<>();

        for (Student<Number> student : students) {
            persons.addPerson(student);
        }
        for (Teacher<Number> teacher : teachers) {
            persons.addPerson(teacher);
        }
        for (Employee<Number> employee : employees) {
            persons.addPerson(employee);
        }
        InOut.showString(persons.toString());
        InOut.showSeparator();

        InOut.showString("Считаем средний возраст...");
        InOut.pressEnter();
        Double aveAge = AccountController.averageAge(persons);
        InOut.showString("Средний возраст равен: " + aveAge);
        InOut.showSeparator();
        InOut.pressEnter();

        InOut.clearConsole();
        InOut.showString("Распределяем студентов по группам...");
        InOut.pressEnter();
        Student<Number> s1 = students.getAt(1);
        Student<Number> s2 = students.getAt(2);
        Student<Number> s3 = students.getAt(3);
        Student<Number> s4 = students.getAt(4);
        Student<Number> s5 = students.getAt(5);
        Student<Number> s6 = students.getAt(6);
        Student<Number> s7 = students.getAt(7);
        Student<Number> s8 = students.getAt(8);
        Student<Number> s9 = students.getAt(9);
        Student<Number> s10 = students.getAt(10);
        Student<Number> s11 = students.getAt(11);
        Student<Number> s12 = students.getAt(12);
        Student<Number> s13 = students.getAt(13);
        ArrayList<Student<Number>> listStud = new ArrayList<>();
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s10);
        listStud.add(s8);

        StudentGroup<Number> group4580 = new StudentGroup<>(listStud, 4580);
        StudentGroup<Number> group2210 = new StudentGroup<>(null, 2210);
        group2210.add(s7);
        group2210.add(s5);
        group2210.add(s1);
        group2210.add(s6);
        StudentGroup<Number> group5281 = new StudentGroup<>(null, 5281);
        group5281.add(s11);
        group5281.add(s13);
        group5281.add(s9);
        group5281.add(s12);
        group5281.add(s4);
        StudentStream<Number> stream555 = new StudentStream<>(null, 555);
        stream555.add(group4580);
        stream555.add(group5281);
        stream555.add(group2210);
        System.out.println(stream555);
        InOut.showString("СПАСИБО! ДО НОВЫХ ВСТРЕЧ!");
        InOut.showSeparator();
        InOut.pressEnter();
    }
}