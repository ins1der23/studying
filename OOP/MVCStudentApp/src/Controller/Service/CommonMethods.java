package Service;

import java.util.HashSet;
import java.util.List;

import Model.Core.Student;

//Статические общие методы
public class CommonMethods {

    // приведение к double
    public static Double toDouble(Number num) {
        if (num instanceof Integer)
            return (double) num.intValue();
        if (num instanceof Float)
            return (double) num.doubleValue();
        return (double) num;
    }

    // получение списка с уникальными Student
    public static List<Student<Number>> makeUnique(List<Student<Number>> students) {
        HashSet<Student<Number>> temp = new HashSet<>();
        temp.addAll(students);
        students.clear();
        students.addAll(temp);
        return students;
    }
}
