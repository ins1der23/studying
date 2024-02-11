package Model.Domain;

public class NoteParser {

    public int isValid(String input) {
        input = input.trim();
        int spaces = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ')
                spaces++;
        }
        if (spaces < 5)
            return -1;
        if (spaces > 5)
            return 1;
        return 0;
    }

    public Note toNote(String input) {
        Note note = new Note();
        String[] temp = input.trim().split(" ");
        for (String string : temp) {
            if (dateCheck(string))
                note.setBirthday(string);
            if (phoneCheck(string))
                note.setPhone(Integer.parseInt(string));
            if (genderCheck(string))
                note.setGender(string.charAt(0));
            if (wordCheck(string))
                note.setSurname(string);
            if (wordCheck(string))
                note.setName(string);
            if (wordCheck(string))
                note.setMiddlename(string);
        }
        return note;
    }

    private Boolean wordCheck(String someString) {
        for (char ch : someString.toCharArray()) {
            if (!Character.isLetter(ch))
                return false;
        }
        return true;
    }

    private Boolean dateCheck(String someString) {
        String[] temp = someString.split(".");
        if (temp.length != 3)
            return false;
        for (String string : temp) {
            try {
                Integer.parseInt(string);
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    private Boolean phoneCheck(String someString) {
        try {
            Integer.parseInt(someString);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private Boolean genderCheck(String someString) {
        if (someString.length() != 1)
            return false;
        if (!someString.equals("m") && !someString.equals("f"))
            return false;
        return true;
    }
}
