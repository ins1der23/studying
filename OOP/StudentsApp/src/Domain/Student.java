package Domain;

/**
 * Класс, описывающий студентов
 */
public class Student extends Person implements Comparable<Student> {

    private int id; // уникальный id студента
    private static int idCounter; // счетчик экземпляров класса

    /**
     * Конструткор
     * 
     * @param name имя студента
     * @param age  возраст студента
     */
    public Student(String name, int age) {
        super(name, age);
        this.id = ++idCounter;
    }

    /**
     * Геттер id
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
        return "Student: " + name + ", age: " + age + ", id: " + id;
    }

    /**
     * Переопределение метода сравненения Student, сравнивает два экземпляра по размеру возрасту,
     * а затем по id
     * 
     * @param o экземпляр для сравнения с вызывающим экземпляром
     * @return
     */
    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            if (id == o.id)
                return 0;
            if (id > o.id)
                return 1;
            else
                return -1;
        }

        if (super.getAge() > o.getAge())
            return 1;
        else
            return -1;
    }
}
