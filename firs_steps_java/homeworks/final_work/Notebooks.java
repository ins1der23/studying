import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Notebooks implements Iterable<Notebook> {
    private ArrayList<Notebook> notebookList;

    public Notebooks() {
        notebookList = new ArrayList<>();
    }

    // очистить список
    public void clear() {
        notebookList.removeAll(notebookList);
    }

    // преобразование спика ноутбуков в String[]
    public String[] toStringArray() {
        String[] output = new String[notebookList.size()];
        int i = 0;
        for (Notebook notebook : notebookList) {
            output[i++] = notebook.toString();
        }
        return output;
    }

    // возврат позиции из списка
    public Notebook getPosition(int index) {
        return notebookList.get(index - 1);
    }

    // добавление позиции в список
    public void addPosition(Notebook notebook) {
        if (!notebookList.contains(notebook)) {
            notebookList.add(notebook);
        } else
            System.out.println(Messages.addingError);
    }

    // удаление позиции из списка
    public void deletePosition(Notebook notebook) {
        if (notebookList.contains(notebook)) {
            notebookList.remove(notebook);
        } else
            System.out.println(Messages.existError);
    }

    // заполнение списка ноутбуками из HashSet
    public void getPositionsFromSet(HashSet<Request> parametersSet) {
        for (Request parameters : parametersSet) {
            Notebook notebook = new Notebook(parameters);
            if (!notebookList.contains(notebook)) {
                notebookList.add(notebook);
            } else
                System.out.println(Messages.addingError);
        }
    }

    // отбор и получение списка ноутбуков по заданным параметрам
    public Notebooks requestPositions(Request request) {
        Notebooks output = new Notebooks();
        for (Notebook notebook : notebookList) {
            if (notebook.isSatisfied(request)) {
                output.addPosition(notebook);
            }
        }
        return output;
    }

    // поучение значений полей ноутбуков в списке по ключу
    public String[] getFields(String key) {
        HashSet<String> temp = new HashSet<>();
        for (Notebook notebook : notebookList) {
            temp.add(notebook.getParameters().get(key));
        }
        String[] output = new String[temp.size()];
        int i = 0;
        for (String value : temp) {
            output[i++] = value;
        }
        return output;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Notebook notebook : notebookList) {
            sb.append(i++).append(". ").append(notebook).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Notebooks notebooks = (Notebooks) obj;
        return notebookList.equals(notebooks.notebookList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notebookList);
    }

    @Override
    public Iterator<Notebook> iterator() {
        Iterator<Notebook> iterator = new Iterator<Notebook>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < notebookList.size() && notebookList.get(currentIndex) != null;
            }

            @Override
            public Notebook next() {
                return notebookList.get(currentIndex++);
            }

            @Override
            public void remove() {
                notebookList.remove(currentIndex);
            }
        };
        return iterator;
    }
}
