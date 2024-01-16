package View.Text;

// класс для интерфейса на английском языке
public class TextEng extends InterfaceText {

    @Override
    public void setFields() {
        commands = "Available commands";
        studentList = "---------StudentsList---------";
        listEmpty = "StudentsList is empty";
        inputCommand = "Input command:";
        exit = "Exitting";
        pressEnter = "Press ENTER to continue...";
        fileName = "Input file name";
        success = "SUCCESS";
        inputId = "Input student's ID";
        studentNotFound = "Student with such ID hasn't found";

        commandNone = "Do nothing";
        commandList = "Show StudentsList";
        commandDelete = "Delete student";
        commandSave = "Save to file";
        commandExit = "Exit from program";
    }
}
