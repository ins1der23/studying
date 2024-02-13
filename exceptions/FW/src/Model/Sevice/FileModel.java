package Model.Sevice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import Model.iModel;
import Model.Domain.Note;

/**
 * Класс, отвечающий за работу с файлами
 */
public class FileModel implements iModel {

    /**
     * путь к папке с файлами
     */
    File dir;

    /**
     * / имя файла для работы
     */
    private String fileName;

    /**
     * Конструткор, создающий папку для файлов, если папка уже сущетсвует, удалет
     * все файлы в ней.
     * 
     * @param dirPath путь к файлам
     */
    public FileModel(String dirPath) {
        dir = new File(dirPath);
        if (dir.exists()) {
            dir.mkdir();
            for (File item : dir.listFiles()) {
                item.delete();
            }
        }
    }

    // public void setFileName(String fileName) {
    // this.fileName = dir.getName() + "\\" + fileName;
    // try (FileWriter fw = new FileWriter(fileName, false)) {
    // fw.flush();
    // } catch (Exception e) {
    // System.out.println(e.getMessage());
    // }
    // }

    /**
     * Получение HashMap<String, String> из файла для последующего парсинга в note
     */
    @Override
    public HashMap<String, String> getNotes() {
        HashMap<String, String> notesMap = new HashMap<>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                line.replace("<", " ");
                line.replace(">", " ");
                line = line.trim();
                String[] param = line.split(" ");
                notesMap.put(param[0] + " " + param[3], line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        return notesMap;
    }

    /**
     * Запись note в файл, возвращает true в случае успешной записи.
     */
    @Override
    public Boolean add(Note note) {
        fileName = dir.getName() + "\\" + note.getSurname();
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(note.toString());
            fw.append('\n');
            fw.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
