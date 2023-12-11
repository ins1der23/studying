import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

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
    private HashMap<String, String> parameters;
    

    public Notebook(HashMap<String, String> parameters) {
        id = idCounter++;
        brandName = parameters.get("brandName");
        model = parameters.get("model");
        cpuName = parameters.get("cpuName");
        cpuModel = parameters.get("cpuModel");
        ramVolume = Integer.parseInt(parameters.get("ramVolume"));
        ssdVolume = Integer.parseInt(parameters.get("ssdVolume"));
        os = parameters.get("os");
        price = Integer.parseInt(parameters.get("price"));
        this.parameters = parameters;
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

    public HashMap<String, String> getParameters() {
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
    public Boolean isSatisfied(HashMap<String, String> requirements) {
        boolean check = false;
        if (!parameters.keySet().equals(requirements.keySet())) {
            System.out.println(Messages.parametersError);
            return check;
        }
        for (String key : parameters.keySet()) {
            if (parameters.get(key).equals(requirements.get(key)) ||
                    Integer.parseInt(parameters.get(key)) != 0 &&
                            Integer.parseInt(requirements.get(key)) >= Integer.parseInt(parameters.get(key))) {
                check = true;
            } else
                check = false;
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
