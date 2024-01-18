package Model.Control;

import java.util.HashMap;

import Model.Control.Interfaces.iGetWorkers;
import Model.Domain.Worker;

public class AccountControl<T extends Worker> {

    private HashMap<Worker, Integer> rates;

    public AccountControl(iGetWorkers<T> workers) {
        Worker key;
        for (Worker item : workers.getWorkers()) {
            key = item;
            rates.put(key, null);
        }
    }

    public boolean setRate(Worker worker, int salary) {
        if (rates.containsKey(worker)) {
            rates.put(worker, salary);
            return true;
        }
        return false;
    }

    public Integer paySalary(Worker worker) {
        if (rates.containsKey(worker)) {
            return rates.get(worker);
        }
        return null;
    }
}
