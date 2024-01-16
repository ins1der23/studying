package Model.Core;

/**
 * Абстрактный родительский обобщенный класс для описания ролей в университете,
 * принимает N наследуемое от Number для переменной age"
 */
public abstract class Person<N extends Number> {
    protected String name; // имя
    protected N age; // возраст, возможна передача любого числового типа

    /**
     * Конструктор родительского класса
     * 
     * @param name
     * @param age
     */
    public Person(String name, N age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Геттер name
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Геттер обобщенного age
     */
    public N getAge() {
        return age;
    }

    /**
     * Сеттер обобщенного age
     */
    public void setAge(N age) {
        this.age = age;
    }

    /**
     * Переопределине toString
     */
    @Override
    public String toString() {
        return "Имя: " + name + "Возраст: " + age + "Роль: " + this.getClass().getName();
    }

}