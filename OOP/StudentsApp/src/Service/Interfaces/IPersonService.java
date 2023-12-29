package Service.Interfaces;

import java.util.List;

/**
 * Общий интерфейс для PersonService и наследуемых типов
 */
public interface IPersonService<T> {

    List<T> getAll();
    void sortByName();
    }
