

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class GetFolderContent {
    static Logger logger = Logger.getLogger(GetFolderContent.class.getName());

    public static void main(String[] args) {
        loggerSetting();
        String[] folderContent = getFolderContent(".");
        logger.log(Level.INFO, "Content get");
        writeToFile(folderContent, "content.txt");
    }

    static String[] getFolderContent(String folderPath) {
        File folder = new File(folderPath);
        String[] folderContent = folder.list();
        return folderContent;
    }

    static void writeToFile(String[] toWrite, String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            for (String content : toWrite) {
                fw.write(content);
                logger.info(content);
                fw.write(System.lineSeparator());
            }
            logger.info("SUCCESS");
        } catch (IOException e) {
            e.printStackTrace();
            logger.warning("FAIL" + "/n" + e.getMessage());
        }
    }

    static void loggerSetting() {
        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
        } catch (SecurityException ex) {
            ex.printStackTrace();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
