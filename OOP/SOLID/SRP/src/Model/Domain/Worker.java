package Model.Domain;

import java.sql.Date;

public abstract class Worker {
    protected String name;
    protected Date dob;

    public Worker(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }
}
