package Controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassFile;
import Model.Core.Student;
import View.ViewClass;
import View.Text.InterfaceText;

public class ControllerClass {

    // переменная для текущей модели
    protected iGetModel model;
    // переменная для текущего view
    protected iGetView view;

    // HashMap моделей
    protected Map<String, iGetModel> models;
    // HashMap view
    protected Map<String, iGetView> views;
    // буфер для проверки данных
    protected List<Student<Number>> studentBuffer = new ArrayList<>();

    // конструктор для контроллера c параметрами, принимает HashMap моделей и
    // HashMap интерфейсов,
    // можно задать начальную модель для работы
    public ControllerClass(Map<String, iGetModel> models, Map<String, iGetView> views) {
        this.models = models;
        this.views = views;
        model = models.get("LIST");
    }

    // проверка входящих списка на пустоту
    private boolean testData(List<Student<Number>> students) {
        if (students.size() > 0)
            return true;
        else
            return false;
    }

    // метод запуска для показа всех студентов в модели
    public void update() {
        studentBuffer = model.getStudents();
        if (testData(studentBuffer))
            view.printAllStudents(studentBuffer);
        else
            System.out.println(view.getText().listEmpty());
    }

    // основной метод запуска
    public void run() {
        view = new ViewClass();
        view.clearConsole();
        boolean flag = true;
        int choice;
        while (flag) {
            view.showString(InterfaceText.chooseLanguage);
            choice = view.getInteger(InterfaceText.inputInt);
            switch (choice) {
                case 1:
                    view = views.get("RUS");
                    view.setText();
                    flag = false;
                    break;
                case 2:
                    view = views.get("ENG");
                    view.setText();
                    flag = false;
                    break;
                default:
                    return;
            }
        }
        Command com = Command.NONE;
        flag = true;
        while (flag) {
            view.clearConsole();
            view.showString(view.getText().commands());
            view.showSeparator();
            view.showCommands();
            view.showSeparator();
            String command = view.inputString(view.getText().inputCommand()).toUpperCase();
            if (Command.contains(command))
                com = Command.valueOf(command);
            switch (com) {
                case EXIT:
                    view.clearConsole();
                    flag = false;
                    view.showString(view.getText().exit());
                    break;
                case DELETE:
                    view.clearConsole();
                    int id = view.getInteger(view.getText().inputId());
                    String output = view.getText().studentNotFound();
                    for (iGetModel model : models.values()) {
                        if (model.deleteStudent(id))
                            output = view.getText().success();
                    }
                    view.showString(output);
                    view.pressEnter();
                    break;
                case LIST:
                    view.clearConsole();
                    for (Map.Entry<String, iGetModel> modelEntry : models.entrySet()) {
                        view.showString(modelEntry.getKey());
                        view.printAllStudents(modelEntry.getValue().getStudents());
                    }
                    view.pressEnter();
                    break;
                case NONE:
                    view.pressEnter();
                    break;
                case SAVE:
                    view.clearConsole();
                    List<Student<Number>> toSave = new ArrayList<>();
                    String fileName = view.inputString(view.getText().fileName());
                    ModelClassFile modelFile = new ModelClassFile(fileName);
                    for (iGetModel model : models.values()) {
                        toSave.addAll(model.getStudents());
                    }
                    modelFile.saveUniqueStudentToFile(toSave);
                    view.showString(view.getText().success());
                    view.pressEnter();
                    break;
            }
        }
    }
}