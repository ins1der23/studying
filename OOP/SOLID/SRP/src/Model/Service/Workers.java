package Model.Service;

import java.util.ArrayList;
import java.util.List;

import Model.Control.Interfaces.iGetWorkers;
import Model.Domain.Worker;

public class Workers<T extends Worker> implements iGetWorkers<T> {

    private List<T> dbList;

    public Workers() {
        dbList = new ArrayList<>();
    }

    public List<T> getWorkers() {
        return dbList;
    }

}
