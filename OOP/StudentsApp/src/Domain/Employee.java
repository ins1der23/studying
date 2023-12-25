package Domain;

/**
 * Класс, описывающий работника университета
 */
public class Employee extends Person {
    private String special; // специализация работника

    /**
     * Конструктор
     * @param name имя работника  
     * @param age  возраст работника
     * @param special специализация работника
     */
    public Employee(String name, int age, String special) {
        super(name, age);
        this.special = special;
    }

    /**
     * Геттер special
     * @return String значение special
     */
    public String getSpecial() {
        return special;
    }

}