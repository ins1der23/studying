package Domain;

/**
 * Класс, описывающий преподоавтеля
 */
public class Teacher extends Person {
    
    private String acadDegree; // ученая степень преподователя

    public String getAcadDegree() {
        return acadDegree;
    }

    /** Конструктор
     * @param firstName
     * @param age
     * @param acadDegree
     */
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
}