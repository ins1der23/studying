package Domain;

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
        return "Студент: " + name + ", Возраст: " + age + ", id: " + id;
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
        if (super.getAge() == o.getAge()) {
            if (id == o.id)
                return 0;
            if (id > o.id)
                return 1;
            else
                return -1;
        }
        if ((Double) super.getAge() > (Double) o.getAge())
            return 1;
        else
            return -1;
    }
}
