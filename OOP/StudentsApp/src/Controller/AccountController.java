package Controller;

import Domain.Person;
import Domain.Teacher;
import Service.PersonService;

public class AccountController {

    public static <T extends Teacher<Number>> void paySalary(T teacher, int salary) {
        System.out.println(teacher.getName() + " выплачено " + salary);
    }

    public static <N extends Number, T extends Person<N>> double averageAge(PersonService<N, T> persons) {
        double sum = 0.0;
        for (Person<N> person : persons) {
            if (person.getAge() instanceof Integer)
                sum += (double) ((Integer) person.getAge()).intValue();

        }
        return sum / persons.getCounter();
    }

}
