import java.util.ArrayList;
import java.util.Collections;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentStream;
import Domain.Teacher;
import Service.StudentService;
import Service.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

        StudentService<Number> students = new StudentService<>(null);

        Student<Number> s1 = students.create("Иван", 25, null);
        Student<Number> s2 = students.create("Игорь", 23.5, null);
        Student<Number> s3 = students.create("Иван", 2.7F, null);
        Student<Number> s4 = students.create("Игорь", 23, null);
        Student<Number> s5 = students.create("Даша", 22, null);
        Student<Number> s6 = students.create("Лена", 20F, null);
        Student<Number> s7 = students.create("Вася", 19.5, null);
        Student<Number> s8 = students.create("Петя", 18, null);
        Student<Number> s9 = students.create("Маша", 51.5, null);
        Student<Number> s10 = students.create("Лена", 24, null);
        Student<Number> s11 = students.create("Лиза", 19, null);
        Student<Number> s12 = students.create("Альбина", 21.5, null);
        Student<Number> s13 = students.create("Аня", 24.2, null);

        TeacherService teachers = new TeacherService(null);

        Teacher t1 = teachers.create("Евгений Иванович", 50, "Доцент");
        Teacher t2 = teachers.create("Иван Васильевич", 55, "Профессор");
        Teacher t3 = teachers.create("Анна Петровна", 34, "Кандидат наук");
        Teacher t4 = teachers.create("Полина Сергеевна", 35, "Доктор наук");

        System.out.println("=============================================");
        System.out.println(teachers);
        System.out.println("=============================================");
        teachers.sortByName();
        System.out.println(teachers);
        System.out.println("=============================================");

        String s1Type = s1.getAge().getClass().getName();
        String s2Type = s2.getAge().getClass().getName();
        String s3Type = s3.getAge().getClass().getName();
        System.out.println("Тип age s1 - " + s1Type);
        System.out.println("Тип age s2 - " + s2Type);
        System.out.println("Тип age s3 - " + s3Type);
        System.out.println("=============================================");

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

        for (StudentGroup<Number> studentGroup : stream555) {
            System.out.println(studentGroup.toString());
        }

        System.out.println("=============================================");
        Collections.sort(stream555.getGroup());

        for (StudentGroup<Number> studentGroup : stream555) {
            System.out.println(studentGroup.toString());
        }

        System.out.println("=============================================");
        System.out.println(stream555);

    }
}