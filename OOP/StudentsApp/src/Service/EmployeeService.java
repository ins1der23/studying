package Service;

import java.util.List;

import Domain.Employee;
import Service.Interfaces.IPersonCreate;

public class EmployeeService<N extends Number> extends PersonService<N, Employee<N>> implements IPersonCreate<N> {

    public EmployeeService(List<Employee<N>> persons) {
        super();
        if (persons != null)
            super.persons.addAll(persons);
        super.counter = 0;
    }

    @Override
    public void create(String name, N age, String speciality) {
        Employee<N> employee = new Employee<>(name, age, speciality);
        persons.add(employee);
        counter++;
    }

    @Override
    public String toString() {
        String output = new String();
        for (Employee<N> item : persons) {
            output += item.toString() + "\n";
        }
        return output;
    }
}
