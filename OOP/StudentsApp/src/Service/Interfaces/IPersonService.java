package Service.Interfaces;

import java.util.List;


public interface IPersonService<T> {

    List<T> getAll();
    void sortByName();
    }
