public class Controller {
    public static void main(String[] args) {
        Common.clearConsole();
        var notebooks = new Notebooks();
        notebooks.getPositionsFromSet(FileWork.readDbFromFile());
        while (true) {
            int choice = Common.getChoiceFromMenu(Messages.mainMenu, Messages.mainMenuOptions, Messages.chooseOption,
                    true);
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
                    choice = Common.getChoiceFromMenu("", notebooksToMenu, Messages.chooseOption, true);
                    var notebook = notebooks.getFromList(choice);
                    choice = Common.getChoiceFromMenu(notebook.toString(), Messages.notebookMenu, Messages.chooseOption,
                            true);
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
                            false);
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

    private static Request getSearchingRequest(Notebooks notebooks) {
        Request request = new Request();
        int choice;
        choice = Common.getChoiceFromMenu(Messages.inputBrand, notebooks.getFields("brandName"), Messages.chooseOption,
                true);
        String brandName = notebooks.getFields("brandName")[choice - 1];
        String model = Common.getString(Messages.inputModel + Messages.orBlankField, true);
        String cpuName = Common.getString(Messages.inputCpuName + Messages.orBlankField, true);
        String cpumodel = Common.getString(Messages.inputCpuModel + Messages.orBlankField, true);
        int ramVolume = Common.getInteger(Messages.inputRAM + Messages.orZero, true);
        int ssdVolume = Common.getInteger(Messages.inputSSD + Messages.orZero, true);
        choice = Common.getChoiceFromMenu(Messages.inputOs, notebooks.getFields("os"), Messages.chooseOption,
                true);
        String os = notebooks.getFields("os")[choice - 1];
        int price = Common.getInteger(Messages.inputPrice + Messages.orZero, true);

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
        String brandName = Common.getString(Messages.inputBrand, true);
        String model = Common.getString(Messages.inputModel, true);
        String cpuName = Common.getString(Messages.inputCpuName, true);
        String cpumodel = Common.getString(Messages.inputCpuModel, true);
        int ramVolume = Common.getInteger(Messages.inputRAM, true);
        int ssdVolume = Common.getInteger(Messages.inputSSD, true);
        String os = Common.getString(Messages.inputOs, true);
        int price = Common.getInteger(Messages.inputPrice, true);
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
