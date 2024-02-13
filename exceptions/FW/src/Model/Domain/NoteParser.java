package Model.Domain;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Класс создающий запись через парсинг строки
 */
public class NoteParser {

    /**
     * Переменная для Note
     */
    private Note note;

    /**
     * Переменная HashMap<String, String> для полей Note
     */
    private HashMap<String, String> fields;

    // Исключения класса
    private RuntimeException dateException;
    private RuntimeException nameException;
    private RuntimeException genderException;
    private RuntimeException phoneException;
    private RuntimeException notEnoughException;
    private RuntimeException tooMuchException;

    /**
     * Конструктор без параметров
     */
    public NoteParser() {
        note = new Note();
        fields = new HashMap<>();
        dateException = new RuntimeException("Неверная дата");
        nameException = new RuntimeException("Неверное ФИО");
        genderException = new RuntimeException("Неверный пол");
        phoneException = new RuntimeException("Неверный телефон");
        notEnoughException = new RuntimeException("Введены не все данные");
        tooMuchException = new RuntimeException("Ввели слишком много данных");
    }


    /**
     * Сброс перемнных note и fields
     */
    public void clear() {
        note = new Note();
        fields = new HashMap<>();
    }

    /**
     * Геттер note
     */
    public Note getNote() {
        return note;
    }


    /**
     * Установка полей note через парсинг String с проверками данных. Если все верно, запоняет поля note из fields
     * @param input Данные для парсинга
     */
    public void setNote(String input) {
        clear();
        switch (isValid(input)) {
            case 0:
                parseToHashMap(input);
                try {
                    fieldsCheck();
                    note.setSurname(fields.get("Surname"));
                    note.setName(fields.get("Name"));
                    note.setMiddlename(fields.get("Middlename"));
                    note.setBirthday(fields.get("Birthday"));
                    note.setPhone(Long.parseLong(fields.get("Phone")));
                    note.setGender(fields.get("Gender").toLowerCase().charAt(0));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case -1:
                System.out.println(notEnoughException.getMessage());
                break;
            case 1:
                System.out.println(tooMuchException.getMessage());
                break;
        }
    }

    /**
     * Проверяет строку на соответствие требованиям по количеству
     * @param input Данные для проверки 
     * @return 0 - если данные соответствуют, -1 - еси данных меньше, 1 - если данных больше
     */
    private int isValid(String input) {
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

    /**
     * Осуществялет парсинг строки в fields c проверками данных
     * @param input Данные для парсинга
     */
    private void parseToHashMap(String input) {
        String[] inputSplit = input.trim().split(" ");
        ArrayList<Integer> nameIndexes = new ArrayList<>(1);
        for (int i = 0; i < inputSplit.length; i++) {
            if (wordCheck(inputSplit[i]))
                nameIndexes.add(i);
            if (dateCheck(inputSplit[i]))
                fields.put("Birthday", inputSplit[i]);
            if (phoneCheck(inputSplit[i]))
                fields.put("Phone", inputSplit[i]);
            if (genderCheck(inputSplit[i]))
                fields.put("Gender", inputSplit[i]);
        }
        if (nameIndexes.size() == 3) {
            fields.put("Surname", inputSplit[nameIndexes.get(0)]);
            fields.put("Name", inputSplit[nameIndexes.get(1)]);
            fields.put("Middlename", inputSplit[nameIndexes.get(2)]);
        }
    }


    /**
     * Проверка заполнености fileds перед записью в поля note
     * @throws Exception Исключения, соответсвующие типу проблемы
     */
    private void fieldsCheck() throws Exception {
        if (!fields.containsKey("Gender"))
            throw genderException;
        if (!fields.containsKey("Surname"))
            throw nameException;
        if (!fields.containsKey("Birthday"))
            throw dateException;
        if (!fields.containsKey("Phone"))
            throw phoneException;
        if (!fields.containsKey("Gender"))
            throw genderException;
    }


    /**
     * Проверка, является ли строка словом
     * @param someString строка для проверки
     * @return
     */
    private Boolean wordCheck(String someString) {
        if (someString.length() == 1)
            return false;
        for (char ch : someString.toCharArray()) {
            if (!Character.isLetter(ch))
                return false;
        }
        return true;
    }

    /**
     * Проверка, является ли строка датой
     * @param someString строка для проверки
     * @return
     */
    private Boolean dateCheck(String someString) {
        String[] temp = someString.split("\\.");
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

    /**
     * Проверка, является ли строка телефоном
     * @param someString строка для проверки
     * @return
     */
    private Boolean phoneCheck(String someString) {
        try {
            Long.parseLong(someString);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * Проверка, является ли строка полом
     * @param someString строка для проверки
     * @return
     */
    private Boolean genderCheck(String someString) {
        if (someString.length() != 1)
            return false;
        someString = someString.toLowerCase();
        if (!someString.equals("m") && !someString.equals("f"))
            return false;
        return true;
    }
}
