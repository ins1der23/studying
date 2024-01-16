package Controller.Interfaces;

import java.util.List;

import Model.Core.Student;

public interface iGetView {

    void printAllStudents(List<Student<Number>> students);

    String inputString(String msg);

    iGetText getText();

    // показать команды
    void showCommands();

    void showString(String message);

    // очистка консоли
    void clearConsole();

    // показать разделитель
    void showSeparator();

    // получение Integer
    int getInteger(String message);

    // получение Integer
    void pressEnter();

    // назначить язык интерфейсв
    void setText();

}
