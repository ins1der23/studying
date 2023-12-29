package Controller;

import Domain.Person;
import Domain.Teacher;
import InOut.InOut;
import Service.PersonService;

public class AccountController {

    /**
     * Метод для выплаты зарплаты учителям
     * @param <T> общий тип для пердачи в метод, наследуется от Teacher
     * @param teacher переменная для начисления зарплаты
     * @param salary размер зарплаты
     */
    public static <T extends Teacher<Number>> void paySalary(T teacher, int salary) {
        System.out.println(teacher.getName() + " выплачено " + salary);
    }

    /**
     * Cтатический метод подсчета среднего возраста всех участников
     * 
     * @param <N>     обобщенный тип для переменной age, наследуется от Number
     * @param <T>     обобщенный тип для перемеенных person наследуется от Person<N>
     * @param persons Cписок участников для подсчета среднего возраста
     * @return double
     */
    public static <N extends Number, T extends Person<N>> double averageAge(PersonService<N, T> persons) {
        double sum = 0.0;
        for (Person<N> person : persons) {
            sum += InOut.toDouble(person.getAge());
        }
        return sum / persons.getCounter();
    }

}
