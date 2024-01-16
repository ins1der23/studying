package View;

import java.util.List;
import java.util.Scanner;

import Controller.Command;
import Controller.Interfaces.iGetText;
import Controller.Interfaces.iGetView;
import Model.Core.Student;

// класс View
public class ViewClass implements iGetView {

    // Scanner
    private static Scanner in = new Scanner(System.in);

    // переменная для класса языка интерфейса
    protected iGetText text;

    // Пустой конструктор
    public ViewClass() {
    }

    /**
     * Коструктор с назначением языка интерфейса
     * 
     * @param text переменная для языка интерфейса
     */
    public ViewClass(iGetText text) {
        this.text = text;
    }

    // Геттер text
    public iGetText getText() {
        return text;
    }

    // установить переменных языка интерфейса
    public void setText() {
        text.setFields();
    }

    // показать всех студентов в списке
    public void printAllStudents(List<Student<Number>> students) {
        showString(text.studentList());
        for (Student<Number> item : students) {
            System.out.println(item);
        }
        showString(text.separator());
    }

    // получение String от пользователя
    @Override
    public String inputString(String msg) {
        showString(msg);
        String output = in.nextLine();
        return output;
    }

    // вывод в консоль
    public void showString(String message) {
        System.out.println(message);
    }

    // очистка консоли
    public void clearConsole() {
        System.out.print("\033[H\033[2J");
    }

    // пауза
    public void pressEnter() {
        System.out.println(text.pressEnter());
        in.nextLine();
        return;
    }

    // показать разделитель
    public void showSeparator() {
        System.out.println(text.separator());
    }

    // получение Integer от пользователя
    public int getInteger(String message) {
        String temp = "";
        boolean isInt = false;
        while (!isInt) {
            System.out.println(message);
            ;
            temp = in.nextLine();
            try {
                Integer.parseInt(temp);
                isInt = true;
            } catch (NumberFormatException e) {
                isInt = false;
            }
        }
        return Integer.parseInt(temp);
    }

    // показать доступные комманды
    @Override
    public void showCommands() {
        System.out.println(Command.getCommands());
    }

}
