package Controller;

import View.Text.InterfaceText;

// enum комманд с описанием
public enum Command {

    NONE(InterfaceText.commandNone()),
    LIST(InterfaceText.commandList()),
    DELETE(InterfaceText.commandDelete()),
    SAVE(InterfaceText.commandSave()),
    EXIT(InterfaceText.commandExit());

    private String title;

    private Command(String title) {
        this.title = title;
    }

    // проверка комманды на соответсвие
    public static boolean contains(String command) {
        try {
            Enum.valueOf(Command.class, command);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

     // получение String со всеми коммандами
    public static String getCommands() {
        String output = "\n";
        for (Command item : Command.values()) {
            output += item + " " + item.title + "\n";
        }
        return output;
    }

}
