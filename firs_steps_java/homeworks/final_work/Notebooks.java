import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Notebooks implements Iterable<Notebook> {
    private ArrayList<Notebook> notebookList;

    public Notebooks() {
        notebookList = new ArrayList<>();
    }

    public void clear() {
        notebookList.removeAll(notebookList);
    }

    public String[] toStringArray() {
        String[] output = new String[notebookList.size()];
        int i = 0;
        for (Notebook notebook : notebookList) {
            output[i++] = notebook.toString();
        }
        return output;
    }

    public Notebook getFromList(int index) {
        return notebookList.get(index - 1);
    }

    public void addPosition(Notebook notebook) {
        if (!notebookList.contains(notebook)) {
            notebookList.add(notebook);
        } else
            System.out.println(Messages.addingError);
    }

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
        String output = new String();
        for (Notebook notebook : notebookList) {
            output += notebook.toString() + "\n";
        }
        return output;
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
