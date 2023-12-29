package Service;

import java.util.List;

import Domain.Employee;
import Service.Interfaces.IPersonCreate;

/**
 * класс для сервисов Employee
 */
public class EmployeeService<N extends Number> extends PersonService<N, Employee<N>> implements IPersonCreate<N> {

    /**
     * Конструктор 
     * @param persons 
     */
    public EmployeeService(List<Employee<N>> persons) {
        super();
        if (persons != null)
            super.persons.addAll(persons);
        super.counter = 0;
    }

    /**
     * Переопределение create для создания и добавления в список, age принмает любой числовой тип
     */
    @Override
    public void create(String name, N age, String speciality) {
        Employee<N> employee = new Employee<>(name, age, speciality);
        persons.add(employee);
        counter++;
    }

}
