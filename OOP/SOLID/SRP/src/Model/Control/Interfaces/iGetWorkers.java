package Model.Control.Interfaces;

import java.util.List;

import Model.Domain.Worker;

public interface iGetWorkers<T extends Worker>{
    List<T> getWorkers();
}
