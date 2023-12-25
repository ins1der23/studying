import java.util.ArrayList;
import java.util.Collections;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 21);
        Student s4 = new Student("Игорь", 24);
        Student s5 = new Student("Даша", 22);
        Student s6 = new Student("Лена", 20);

        Student s7 = new Student("Вася", 19);
        Student s8 = new Student("Петя", 18);
        Student s9 = new Student("Маша", 51);

        Student s10 = new Student("Лена", 24);
        Student s11 = new Student("Лиза", 19);
        Student s12 = new Student("Альбина", 21);
        Student s13 = new Student("Аня", 24);

        ArrayList<Student> listStud = new ArrayList<Student>();
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s10);
        listStud.add(s8);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);

        StudentGroup group2210 = new StudentGroup(null, 2210);
        group2210.addStudent(s7);
        group2210.addStudent(s5);
        group2210.addStudent(s1);
        group2210.addStudent(s6);

        StudentGroup group5281 = new StudentGroup(null, 5281);
        group5281.addStudent(s11);
        group5281.addStudent(s13);
        group5281.addStudent(s9);
        group5281.addStudent(s12);
        group5281.addStudent(s4);

        StudentStream stream555 = new StudentStream(null, 555);
        stream555.addGroup(group4580);
        stream555.addGroup(group5281);
        stream555.addGroup(group2210);

        for (StudentGroup studentGroup : stream555) {
            System.out.println(studentGroup.toString());
        }

        System.out.println("=============================================");
        Collections.sort(stream555.getStream());

        for (StudentGroup studentGroup : stream555) {
            System.out.println(studentGroup.toString());
        }

        System.out.println("=============================================");
        System.out.println(stream555);

    }
}