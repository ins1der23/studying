package Domain;

/**
 * Класс, описывающий работника университета
 */
public class Employee<N extends Number> extends Person<N> {
    private String speciality; // специализация работника

    /**
     * Конструктор
     * 
     * @param name    имя работника
     * @param age     возраст работника
     * @param special специализация работника
     */
    public Employee(String name, N age, String speciality) {
        super(name, age);
        this.speciality = speciality;
    }

    /**
     * Геттер special
     * 
     * @return String значение speciality
     */
    public String getSpeciality() {
        return speciality;
    }

}