package Domain;

/**
 * Абстрактный родительский класс для описания ролей в университете 
 */
public abstract class Person {
    protected String name;
    protected int age;
    
    /**
     * Конструткор родительского класса
     * @param name
     * @param age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}