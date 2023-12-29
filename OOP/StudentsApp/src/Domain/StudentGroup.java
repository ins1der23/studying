package Domain;

import java.util.List;

public class StudentGroup<N extends Number> extends StudentCollection<N, Student<N>> {

    public StudentGroup(List<Student<N>> group, Integer id) {
        super(group, id);
    }

    /**
     * Переопределение toString()
     */
    @Override
    public String toString() {
        String output = new String();
        output += "Номер группы: " + id + "\n" +
                "Количество студентов: " + group.size() + "\n";
        for (Student<N> student : group) {
            output += student.toString() + "\n";
        }
        return output;
    }

    /**
     * Переопределение метода сравненения StudentGroup, сравнивает два экземпляра по
     * размеру группы,
     * а затем по номеру группы
     * 
     * @param o экземпляр для сравнения с вызывающим экземпляром
     * @return
     */
    @Override
    public int compareTo(StudentCollection<N, Student<N>> students) {
        if (group.size() == students.getGroup().size()) {
            if (id == students.getId())
                return 0;
            if (id > students.getId())
                return 1;
            else
                return -1;
        }
        if (group.size() > students.getGroup().size())
            return 1;
        else
            return -1;
    }
}
