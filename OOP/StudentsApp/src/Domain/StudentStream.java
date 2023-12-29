package Domain;

import java.util.List;

/**
 * Класс, описывающий поток судентов, состоящий из групп
 */
public class StudentStream<N extends Number> extends StudentCollection<N, StudentGroup<N>> {

    public StudentStream(List<StudentGroup<N>> group, Integer id) {
        super(group, id);
    }

    /**
     * Переопределение toString()
     */
    @Override
    public String toString() {
        String output = new String();
        output += "Номер потока: " + id + "\n" +
                "Количество групп: " + group.size() + "\n";
        for (StudentGroup<N> students : group) {
            for (Student<N> student : students) {
                output += student.toString() + ", номер группы: " + students.getId() + "\n";
            }
        }
        return output;
    }

    /**
     * Переопределение метода сравненения StudentStream, сравнивает два экземпляра
     * по
     * размеру потока
     * 
     * 
     * @param o экземпляр для сравнения с вызывающим экземпляром
     * @return
     */
    @Override
    public int compareTo(StudentCollection<N, StudentGroup<N>> students) {
        if (group.size() == students.getGroup().size())
            return 0;
        if (group.size() > students.getGroup().size())
            return 1;
        else
            return -1;
    }
}
