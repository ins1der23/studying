package Classes.Services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Класс для создания логгера
 */
public class Logger {
    private static SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //Форматтер даты
    private static StringBuilder sb; 

    private File log; //Файл журнала
    private Date date; //Время записи

    /**
     * Конструктор, принимающий имя файла
     * @param fileName
     */
    public Logger(String fileName) {
        this.log = new File(fileName);
        this.date = new Date();
    }

    /**
     * Метод записи в журнал c отображением message в консоли
     * @param message
     */
    public void addEvent(String message) {
        System.out.println(message);
        sb = new StringBuilder();
        sb.append(formater.format(date)).append(":").append(message).append("\n");
        try (FileWriter fileWriter = new FileWriter(log, true)) {
            fileWriter.append(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод очистки файла журнала
     */
    public void clearLog() {
        try (FileWriter fileWriter = new FileWriter(log)) {
            fileWriter.append(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Геттер log
     * @return
     */
    public File getLog() {
        return log;
    }

}
