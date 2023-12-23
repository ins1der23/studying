package Classes.Services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private static StringBuilder sb;

    private File log;
    private Date date;

    public Logger(String fileName) {
        this.log = new File(fileName);
        this.date = new Date();
    }

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

    public void clearLog()
    {
        try (FileWriter fileWriter = new FileWriter(log)) {
            fileWriter.append(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public File getLog() {
        return log;
    }

}
