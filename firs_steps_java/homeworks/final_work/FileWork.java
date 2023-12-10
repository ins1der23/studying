import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class FileWork {
    private static File dbFile = new File("notebooks.txt");

    public static HashSet<HashMap<String, String>> readDbFromFile() {

        var result = new HashSet<HashMap<String, String>>();
        String line;
        try (BufferedReader bufferreader = new BufferedReader(new FileReader(dbFile))) {
            while ((line = bufferreader.readLine()) != null) {
                String key;
                String value;
                var position = new HashMap<String, String>();
                String[] temp = line.split(",");
                for (String string : temp) {
                    key = string.split(":")[0];
                    value = string.split(":")[1];
                    position.put(key, value);
                }
                result.add(position);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void writeDbToFile(Notebooks notebooks) {
        String line;
        StringBuilder sb = new StringBuilder();
        var iterator = notebooks.iterator();
        while (iterator.hasNext()) {
            var notebook = iterator.next();
            line = notebook.getDbString();
            sb.append(line).append("\n");
        }
        try (FileWriter fileWriter = new FileWriter(dbFile)) {
            fileWriter.append(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
