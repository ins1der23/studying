import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Request {
    private LinkedHashMap<String, String> parameters;

    public Request() {
        parameters = new LinkedHashMap<>();
        parameters.put("id", "0");
        parameters.put("brandName", new String());
        parameters.put("model", new String());
        parameters.put("cpuName", new String());
        parameters.put("cpuModel", new String());
        parameters.put("ramVolume", new String());
        parameters.put("ssdVolume", new String());
        parameters.put("os", new String());
        parameters.put("price", new String());
    }

    public LinkedHashMap<String, String> getParameters() {
        return parameters;
    }

    // добавить параметр в Request
    public void put(String key, String value) {
        parameters.put(key, value);
    }

    @Override
    public String toString() {
        String output = new String();
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            output += entry + "\n";
        }
        return output;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Request request = (Request) obj;
        return parameters.equals(request.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters);
    }

}
