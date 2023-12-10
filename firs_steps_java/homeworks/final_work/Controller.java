import java.util.HashMap;

public class Controller {
    public static void main(String[] args) {
        
        var notebooks = new Notebooks();
        notebooks.getPositionsFromSet(FileWork.readDbFromFile());
        System.out.println(notebooks);

        var params = new HashMap<String, String>();
        params.put("brandName", "Lenovo");
        params.put("model", "IdeaPad 3");
        params.put("cpuName", "INTEL");
        params.put("cpuModel", "Core i3");
        params.put("ramVolume", "8");
        params.put("ssdVolume", "256");
        params.put("os", "windows");
        params.put("price", "54000");
        Notebook notebook = new Notebook(params);
        notebooks.addPosition(notebook);
        System.out.println(notebooks);
             


    }
}
