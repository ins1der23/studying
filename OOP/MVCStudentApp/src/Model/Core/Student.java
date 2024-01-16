package Model.Core;

import Service.CommonMethods;

/**
 * Класс, описывающий студентов
 */
public class Student<N extends Number> extends Person<N> implements Comparable<Student<N>> {

    private int id; // уникальный id студента
    private static int idCounter; // счетчик экземпляров класса

    /**
     * Конструткор
     * 
     * @param name имя студента
     * @param age  возраст студента
     */
    public Student(String name, N age) {
        super(name, age);
        this.id = ++idCounter;
    }

    public Student(String name, N age, Integer id) {
        super(name, age);
        this.id = id;
    }

    /**
     * Геттер id
     * 
     * @return int значение id
     */
    public int getId() {
        return id;
    }

    /**
     * Переопределение метода toString()
     */
    @Override
    public String toString() {
        return "id: " + id + ". Студент: " + name + ", Возраст: " + age;
    }

    /**
     * Переопределение метода сравненения Student, сравнивает два экземпляра по
     * возрасту, а затем по id
     * 
     * @param o экземпляр для сравнения с вызывающим экземпляром
     * @return
     */
    @Override
    public int compareTo(Student<N> o) {
        if (CommonMethods.toDouble(super.getAge()) == CommonMethods.toDouble(o.getAge())) {
            if (id == o.id)
                return 0;
            if (id > o.id)
                return 1;
            else
                return -1;
        }
        if (CommonMethods.toDouble(super.getAge()) > CommonMethods.toDouble(o.getAge()))
            return 1;
        else
            return -1;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student<N> other = (Student<N>) obj;
        if (this.name.equals(other.name) &&
                this.age.equals(other.age))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return id + name.hashCode() + age.hashCode();
    }
}
