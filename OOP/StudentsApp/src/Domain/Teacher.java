package Domain;

/**
 * Класс, описывающий преподоавтеля, age только int
 */
public class Teacher extends Person<Integer> {
    
    private String acadDegree; // ученая степень преподователя

    public String getAcadDegree() {
        return acadDegree;
    }

    /** Конструктор
     * @param firstName // String
     * @param age // только int
     * @param acadDegree //String
     */
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }

    @Override
    public String toString() {
        return "Преподаватель: " + name + ", возраст " + age + ", Степень: " + acadDegree;
    }
}