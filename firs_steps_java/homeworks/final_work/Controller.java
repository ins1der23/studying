public class Controller {
    public static void main(String[] args) {
        Common.clearConsole();
        var notebooks = new Notebooks();
        notebooks.getPositionsFromSet(FileWork.readDbFromFile());
        while (true) {
            int choice = Common.getChoiceFromMenu(Messages.mainMenu, Messages.mainMenuOptions, Messages.chooseOption,
                    true, true);
            switch (choice) {
                case 1: // Посмотреть все ноутбуки
                    Common.showString(notebooks.toString(), true);
                    Common.pressEnter(Messages.pressEnter);
                    break;
                case 2: // Найти ноутбук
                    Request request = getSearchingRequest(notebooks);
                    Common.showString(Messages.requestParameters + ":\n", true);
                    Common.showString(request.toString(), false);
                    Common.pressEnter(Messages.pressEnter);
                    var foundNotebooks = notebooks.requestPositions(request);
                    String[] notebooksToMenu = foundNotebooks.toStringArray();
                    choice = Common.getChoiceFromMenu("", notebooksToMenu, Messages.chooseOption, true, true);
                    var notebook = notebooks.getPosition(choice);
                    choice = Common.getChoiceFromMenu(notebook.toString(), Messages.notebookMenu, Messages.chooseOption,
                            true, true);
                    switch (choice) {
                        case 1: // Удалить ноутбук
                            notebooks.deletePosition(notebook);
                            break;
                        default: // Возврат
                            break;
                    }
                    break;
                case 3: // Добавить ноутбук
                    request = getAddingRequest();
                    notebook = new Notebook(request);
                    Common.showString(notebook.toString(), true);
                    choice = Common.getChoiceFromMenu(Messages.addNotebook, Messages.yesOrNo, Messages.chooseOption,
                            false, true);
                    if (choice == 1) {
                        notebooks.addPosition(notebook);
                    }
                    break;
                case 4: // Сохранить изменения
                    FileWork.writeDbToFile(notebooks);
                    Common.showString(Messages.changesSaved, true);
                    Common.pressEnter(Messages.pressEnter);
                    break;
                case 5: // Выход
                    return;
            }
        }
    }

    // получение Request для поиска ноутбука в базе
    private static Request getSearchingRequest(Notebooks notebooks) {
        Request request = new Request();
        String brandName = getPossibleOptions("brandName", Messages.inputBrand, notebooks);
        String model = getPossibleOptions("model", Messages.inputModel, notebooks);
        String cpuName = getPossibleOptions("cpuName", Messages.inputCpuName, notebooks);
        String cpuModel = getPossibleOptions("cpuModel", Messages.inputCpuModel, notebooks);
        int ramVolume = Common.getInteger(Messages.inputRAM + Messages.orZero, true);
        int ssdVolume = Common.getInteger(Messages.inputSSD + Messages.orZero, true);
        String os = getPossibleOptions("os", Messages.inputOs, notebooks);
        int price = Common.getInteger(Messages.inputPrice + Messages.orZero, true);
        request.put("brandName", brandName);
        request.put("model", model);
        request.put("cpuName", cpuName);
        request.put("cpuModel", cpuModel);
        request.put("ramVolume", new String() + ramVolume);
        request.put("ssdVolume", new String() + ssdVolume);
        request.put("os", os);
        request.put("price", new String() + price);
        return request;
    }

    // получение вoзможных вариантов параметров для добавления в поисковый Request
    public static String getPossibleOptions(String name, String message, Object obj) {
        String output = new String();
        if (Notebooks.class != obj.getClass()) {
            return output;
        }
        Notebooks notebooks = (Notebooks) obj;
        int choice = Common.getChoiceFromMenu(message, notebooks.getFields(name),
                Messages.chooseOptionOrZero,
                true, false);
        if (choice != 0) {
            output = notebooks.getFields(name)[choice - 1];
        }
        return output;
    }

    // получение Request для добавления ноутбука в базу
    private static Request getAddingRequest() {
        Request request = new Request();
        String brandName = Common.getString(Messages.inputBrand, true);
        String model = Common.getString(Messages.inputModel, true);
        String cpuName = Common.getString(Messages.inputCpuName, true);
        String cpuModel = Common.getString(Messages.inputCpuModel, true);
        int ramVolume = Common.getInteger(Messages.inputRAM, true);
        int ssdVolume = Common.getInteger(Messages.inputSSD, true);
        String os = Common.getString(Messages.inputOs, true);
        int price = Common.getInteger(Messages.inputPrice, true);
        request.put("brandName", brandName);
        request.put("model", model);
        request.put("cpuName", cpuName);
        request.put("cpuModel", cpuModel);
        request.put("ramVolume", new String() + ramVolume);
        request.put("ssdVolume", new String() + ssdVolume);
        request.put("os", os);
        request.put("price", new String() + price);
        return request;
    }
}
