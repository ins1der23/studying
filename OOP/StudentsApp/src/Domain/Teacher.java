package Domain;

/**
 * Класс, описывающий преподоавтеля
 */
public class Teacher<N extends Number> extends Person<N> {

    private String acadDegree; // ученая степень преподователя

    public String getAcadDegree() {
        return acadDegree;
    }

    /**
     * Конструктор
     * 
     * @param firstName
     * @param age
     * @param acadDegree
     */
    public Teacher(String firstName, N age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }

    /**
     * Переопределение метода toString()
     */
    @Override
    public String toString() {
        return "Преподаватель: " + name + ", возраст " + age + ", Степень: " + acadDegree;
    }
}