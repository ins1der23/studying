import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Notebook {

    private static int idCounter = 1;
    private int id;
    private String brandName;
    private String model;
    private String cpuName;
    private String cpuModel;
    private int ramVolume;
    private int ssdVolume;
    private String os;
    private int price;
    private LinkedHashMap<String, String> parameters;

    public Notebook(Request request) {
        var incoming = request.toLinkedHashMap();
        id = idCounter++;
        brandName = incoming.get("brandName");
        model = incoming.get("model");
        cpuName = incoming.get("cpuName");
        cpuModel = incoming.get("cpuModel");
        ramVolume = Integer.parseInt(incoming.get("ramVolume"));
        ssdVolume = Integer.parseInt(incoming.get("ssdVolume"));
        os = incoming.get("os");
        price = Integer.parseInt(incoming.get("price"));
        parameters = incoming;
        parameters.put("id", new String() + id);
    }

    public int getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModel() {
        return model;
    }

    public String getCpuName() {
        return cpuName;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public int getRamVolume() {
        return ramVolume;
    }

    public int getSsdVolume() {
        return ssdVolume;
    }

    public String getOs() {
        return os;
    }

    public LinkedHashMap<String, String> getParameters() {
        return parameters;
    }

    public int getPrice() {
        return price;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public void setRamVolume(int ramVolume) {
        this.ramVolume = ramVolume;
    }

    public void setSsdVolume(int ssdVolume) {
        this.ssdVolume = ssdVolume;
    }

    public void setOs(String os) {
        ArrayList<String> possibleOs = new ArrayList<String>(Arrays.asList("dos", "linux", "macos", "windows"));
        if (possibleOs.contains(os.toLowerCase())) {
            this.os = os;
        } else
            System.out.println(Messages.inputError);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // проверка на соответствие ноутбука заданным условиям
    public Boolean isSatisfied(Request request) {
        var requirements = request.toLinkedHashMap();
        boolean check = false;
        if (!parameters.keySet().equals(requirements.keySet())) {
            System.out.println(Messages.parametersError);
            return false;
        }
        for (String key : requirements.keySet()) {
            int left;
            int right;
            if (parameters.get(key).toLowerCase().equals(requirements.get(key).toLowerCase())
                    || requirements.get(key).equals(new String())) {
                check = true;
            } else if (Common.tryParseInt(requirements.get(key))
                    && Common.tryParseInt(parameters.get(key))) {
                left = Integer.parseInt(requirements.get(key));
                right = Integer.parseInt(parameters.get(key));
                check = left <= right;
            } else {
                return false;
            }
        }
        return check;
    }

    // получение строки для записи в файл
    public String getDbString() {
        return String.format(
                "id:%d,brandName:%s,model:%s,cpuName:%s,cpuModel:%s,ramVolume:%d,ssdVolume:%d,os:%s,price:%d",
                id, brandName, model, cpuName, cpuModel, ramVolume, ssdVolume, os, price);
    }

    @Override
    public String toString() {
        return String.format("ID:%d. %s %s, %s %s, RAM %d Gb, SDD %d Gb, OS %s, цена - %dр.",
                id, brandName, model, cpuName, cpuModel, ramVolume, ssdVolume, os, price);
    }

}
