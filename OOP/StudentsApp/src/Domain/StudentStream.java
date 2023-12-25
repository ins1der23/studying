package Domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Service.Iterators.GroupIterator;

/**
 * Класс, описывающий поток судентов, состоящий из групп
 */
public class StudentStream implements Iterable<StudentGroup> {

    private List<StudentGroup> stream; // список групп в потоке
    private int streamId; // номер потока

    /**
     * Конструктор создает экземпляр StudentStream
     * присваивает переменной stream новый ArrayList<StudentGroup> и добавляет в нее
     * передаваемый список групп, если список != null.
     * 
     * @param stream  список групп для добавления
     * @param groupId номер потока
     */
    public StudentStream(List<StudentGroup> stream, int streamId) {
        this.stream = new ArrayList<>();
        if (stream != null)
            this.stream.addAll(stream);
        this.streamId = streamId;
    }

    /**
     * Геттер stream
     * 
     * @return список групп студентов
     */
    public List<StudentGroup> getStream() {
        return stream;
    }

    /**
     * Геттер streamId
     * 
     * @return значение streamId
     */
    public int getStreamId() {
        return streamId;
    }

    /**
     * Сеттер streamId
     * 
     * @param streamId новый номер потока
     */
    public void setStreamId(int streamId) {
        this.streamId = streamId;
    }

    /**
     * Метод добавления группы в поток
     * 
     * @param students группа для добавления
     */
    public void addGroup(StudentGroup students) {
        this.stream.add(students);
    }

    /**
     * Переопределение toString()
     */
    @Override
    public String toString() {
        String output = new String();
        output += "Номер потока: " + this.streamId + "\n" +
                "Количество групп: " + this.stream.size() + "\n";
        for (StudentGroup students : this.stream) {
            for (Student student : students) {
                output += student.toString() + ", номер группы: " + students.getGroupId() + "\n";
            }
        }
        return output;
    }

    /**
     * Переопределение итератора StudentGroup
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(stream);
    }

}
