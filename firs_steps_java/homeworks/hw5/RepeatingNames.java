import java.util.HashMap;

public class RepeatingNames {

    private HashMap<String, Integer> names = new HashMap<>();

    public void addName(String name) {
        int counter = 1;
        if (names.containsKey(name)) {
            counter = names.get(name) + 1;
        }
        names.put(name, counter);
    }

    public void showNamesOccurrences() {
        System.out.println(names);
    }
}
