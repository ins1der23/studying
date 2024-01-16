package View.Text;

// класс для интерфейса на русском языке
public class TextRus extends InterfaceText {

    @Override
    public void setFields() {
        commands = "Доступные комманды";
        studentList = "-------Список студентов-------";
        listEmpty = "Список студентов пуст";
        inputCommand = "Введите команду:";
        exit = "Выходим из программы";
        pressEnter = "Нажмите ENTER для продолжения";
        fileName = "Введите имя файла";
        success = "Успешно выполнено";
        inputId = "Введите ID студента";
        studentNotFound = "Студент с таким ID не найден";

        commandNone = "Ничего не делать";
        commandList = "Показать список студентов";
        commandDelete = "Удалить студента";
        commandSave = "Сохранить в файл";
        commandExit = "Выход из прораммы";
    }
}
