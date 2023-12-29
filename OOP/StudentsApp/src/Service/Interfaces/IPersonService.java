package Service.Interfaces;

import java.util.List;

public interface IPersonService<N, T> {

    List<T> getAll();
    void sortByName();
    T create(String name, N age, String addition);
}
