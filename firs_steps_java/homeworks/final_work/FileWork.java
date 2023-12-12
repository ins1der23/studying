import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class FileWork {
    private static File dbFile = new File("notebooks.txt");

    public static HashSet<Request> readDbFromFile() {

        var result = new HashSet<Request>();
        String line;
        try (BufferedReader bufferreader = new BufferedReader(new FileReader(dbFile))) {
            while ((line = bufferreader.readLine()) != null) {
                String key;
                String value;
                var position = new Request();
                String[] temp = line.split(",");
                for (String string : temp) {
                    key = string.split(":")[0];
                    value = string.split(":")[1];
                    position.add(key, value);
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
