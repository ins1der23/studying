package Domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Service.Iterators.StudentIterator;

/**
 * Класс, описывающий группу студентов
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {

    private List<Student> group; // список студентов в группе
    private Integer groupId; // номер группы

    /**
     * Конструктор создает экземпляр StudentGroup
     * присваивает переменной group новый ArrayList<Student> и добавляет в нее
     * передаваемы список студентов, если список != null
     * 
     * @param group   список студентов для добавления
     * @param groupId номер группы
     */
    public StudentGroup(List<Student> group, Integer groupId) {
        this.group = new ArrayList<>();
        if (group != null)
            this.group.addAll(group);
        this.groupId = groupId;
    }

    /**
     * Геттер group
     * 
     * @return список студентов группы
     */
    public List<Student> getGroup() {
        return this.group;
    }

    /**
     * Геттер groupId
     * 
     * @return значение groupId
     */
    public Integer getGroupId() {
        return this.groupId;
    }

    /**
     * Сеттер groupId
     * 
     * @param groupId новый номер группы
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * Метод добавления студента в группу
     * 
     * @param student студент для добавления
     */
    public void addStudent(Student student) {
        this.group.add(student);
    }

    /**
     * Переопределение toString()
     */
    @Override
    public String toString() {
        String output = new String();
        output += "Номер группы: " + this.groupId + "\n" +
                "Количество студентов: " + this.group.size() + "\n";
        for (Student student : this.group) {
            output += student.toString() + "\n";
        }
        return output;
    }

    /**
     * Переопределение итератора Student
     */
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);

    }

    /**
     * Переопределение метода сравненения StudentGroup, сравнивает два экземпляра по размеру группы,
     * а затем по номеру группы
     * 
     * @param o экземпляр для сравнения с вызывающим экземпляром
     * @return
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.group.size() == o.getGroup().size()) {
            if (this.groupId == o.getGroupId())
                return 0;
            if (this.groupId > o.getGroupId())
                return 1;
            else
                return -1;
        }
        if (this.group.size() > o.getGroup().size())
            return 1;
        else
            return -1;
    }
}
