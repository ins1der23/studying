package Service.Interfaces;

/**
 * Интерфейс для наследуемых типов PersonService, нужен для создание экземпляров класса Person
 */
public interface IPersonCreate<N extends Number>
 {
     void create(String name, N age, String acadDegree);
}
