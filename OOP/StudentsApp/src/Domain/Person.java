package Domain;

/**
 * Абстрактный родительский класс для описания ролей в университете
 */
public abstract class Person<N extends Number> {
    protected String name; // имя
    protected N age; // возраст, возможна передача любого числового типа 
    
    /**
     * Конструктор родительского класса
     * @param name
     * @param age
     */
    public Person(String name, N age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public N getAge() {
        return age;
    }

    public void setAge(N age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}