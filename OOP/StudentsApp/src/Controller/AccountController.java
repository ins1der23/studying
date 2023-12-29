package Controller;

import Domain.Teacher;

public class AccountController {
    
    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено " + salary);
    }
}
