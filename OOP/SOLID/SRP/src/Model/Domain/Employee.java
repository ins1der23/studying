package Model.Domain;

import java.sql.Date;

public class Employee extends Worker {

    public Employee(String name, Date dob) {
        super(name, dob);
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
