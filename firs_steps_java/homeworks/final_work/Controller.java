public class Controller {
    public static void main(String[] args) {
        var notebooks = new Notebooks();
        notebooks.getPositionsFromSet(FileWork.readDbFromFile());
        while (true) {
            int choice = Common.getChoiceFromMenu(Messages.mainMenu, Messages.mainMenuOptions, Messages.chooseOption,
                    true);
            switch (choice) {
                case 1: // Посмотреть все ноутбуки
                    String[] notebooksToMenu = notebooks.toStringArray();
                    choice = Common.getChoiceFromMenu("", notebooksToMenu, Messages.chooseOption, true);
                    var notebook = notebooks.getFromList(choice);
                    choice = Common.getChoiceFromMenu(notebook.toString(), Messages.notebookMenu, Messages.chooseOption,
                            false);
                    switch (choice) {
                        case 1: // Удалить ноутбук
                            notebooks.deletePosition(notebook);
                            break;
                        default: // Выйти
                            break;
                    }
                    break;
                case 2: // Найти ноутбук
                    Request request = getSearchingRequest(notebooks);
                    Common.showString(Messages.requestParameters + "\n", true);
                    Common.showString(request.toString(), false);
                    Common.pressEnter(Messages.pressEnter);
                    break;

                case 3: // Добавить ноутбук
                    request = getAddingRequest();
                    notebook = new Notebook(request.toHashMap());
                    System.out.println(notebook);
                    choice = Common.getChoiceFromMenu(Messages.addNotebook, Messages.yesOrNo, Messages.chooseOption,
                            false);
                    if (choice == 1) {
                        notebooks.addPosition(notebook);
                    }
                    break;
                case 4:
                    break;
                case 5:
                    return;
            }

        }

    }

    private static Request getSearchingRequest(Notebooks notebooks) {
        Request request = new Request();
        int choice;
        choice = Common.getChoiceFromMenu(Messages.inputBrand, notebooks.getFields("brandName"), Messages.chooseOption,
                true);
        String brandName = notebooks.getFields("brandName")[choice - 1];
        String model = Common.getString(Messages.inputModel + Messages.orBlankField);
        String cpuName = Common.getString(Messages.inputCpuName + Messages.orBlankField);
        String cpumodel = Common.getString(Messages.inputCpuModel + Messages.orBlankField);
        int ramVolume = Common.getInteger(Messages.inputRAM + Messages.orZero);
        int ssdVolume = Common.getInteger(Messages.inputSSD + Messages.orZero);
        choice = Common.getChoiceFromMenu(Messages.inputOs, notebooks.getFields("os"), Messages.chooseOption,
                true);
        String os = notebooks.getFields("os")[choice - 1];
        int price = Common.getInteger(Messages.inputPrice + Messages.orZero);

        request.add("brandName", brandName);
        request.add("model", model);
        request.add("cpuName", cpuName);
        request.add("cpuModel", cpumodel);
        request.add("ramVolume", new String() + ramVolume);
        request.add("ssdVolume", new String() + ssdVolume);
        request.add("os", os);
        request.add("price", new String() + price);
        return request;
    }

    private static Request getAddingRequest() {
        Request request = new Request();
        String brandName = Common.getString(Messages.inputBrand);
        String model = Common.getString(Messages.inputModel);
        String cpuName = Common.getString(Messages.inputCpuName);
        String cpumodel = Common.getString(Messages.inputCpuModel);
        int ramVolume = Common.getInteger(Messages.inputRAM);
        int ssdVolume = Common.getInteger(Messages.inputSSD);
        String os = Common.getString(Messages.inputOs);
        int price = Common.getInteger(Messages.inputPrice);
        request.add("brandName", brandName);
        request.add("model", model);
        request.add("cpuName", cpuName);
        request.add("cpuModel", cpumodel);
        request.add("ramVolume", new String() + ramVolume);
        request.add("ssdVolume", new String() + ssdVolume);
        request.add("os", os);
        request.add("price", new String() + price);
        return request;
    }
}
