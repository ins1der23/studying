package Service;

import java.util.List;

import Domain.Employee;

public class EmployeeService<N extends Number> extends PersonService<N, Employee<N>> {

    
    public EmployeeService(List<Employee<N>> persons) {
        super(persons);
        super.counter = 0;
    }

    @Override
    public Employee<N> create(String name, N age, String speciality) {
        Employee<N> employee = new Employee<N>(name, age, speciality);
        persons.add(employee);
        counter++;
        return employee;
    }
}
