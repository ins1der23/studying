package View.Text;

import Controller.Interfaces.iGetText;

public abstract class InterfaceText implements iGetText {
    // переменные для текста интерфейса экземляра класса
    protected String commands;
    protected String separator;
    protected String studentList;
    protected String listEmpty;
    protected String inputCommand;
    protected String exit;
    protected String pressEnter;
    protected String fileName;
    protected String success;
    protected String inputId;
    protected String studentNotFound;

    // статические переменные для текста интерфейса без созданяия экземпляра класса
    protected static String commandNone;
    protected static String commandList;
    protected static String commandDelete;
    protected static String commandExit;
    protected static String commandSave;

    // статические переменные для текста интерфейса выбора языка программы
    public static String chooseLanguage = "Choose the language\n1. Russian\n2. English \n3. Exit";
    public static String inputInt = "Input your choice";

    // Конструктор
    public InterfaceText() {
        separator = "------------------------------";
    }

    // Абстрактный метод присвоения значениия полям класса
    public abstract void setFields();

    // Геттеры для переменных
    public String separator() {
        return separator;
    }

    public String commands() {
        return commands;
    }

    public String studentList() {
        return studentList;
    }

    public String listEmpty() {
        return listEmpty;
    }

    public String inputCommand() {
        return inputCommand;
    }

    public String exit() {
        return exit;
    }

    public String pressEnter() {
        return pressEnter;
    }

    public static String commandNone() {
        return commandNone;
    }

    public static String commandList() {
        return commandList;
    }

    public static String commandDelete() {
        return commandDelete;
    }

    public static String commandExit() {
        return commandExit;
    }

    public static String commandSave() {
        return commandSave;
    }

    public String fileName() {
        return fileName;
    }

    public String success() {
        return success;
    }

    public String inputId() {
        return inputId;
    }

    public String studentNotFound() {
        return studentNotFound;
    }

}
