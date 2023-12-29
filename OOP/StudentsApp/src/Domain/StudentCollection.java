package Domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Domain.Iterators.StudentIterator;

/**
 * Абстрактный класс, описывающий группу студентов, родительский класс для
 * StudentGroup и StudentStream
 */
public abstract class StudentCollection<N extends Number, T>
                                          implements Iterable<T>, Comparable<StudentCollection<N, T>> {

    protected List<T> group; // список коллекции
    protected Integer id; // номер группы

    /**
     * Конструктор создает экземпляр 
     * присваивает переменной group новый ArrayList<> и добавляет в нее
     * передаваемы список объектов, если список != null, если список == null, то созадет класс с пустым списком
     * 
     * @param group список группирования
     * @param id    номер группы
     */
    public StudentCollection(List<T> group, Integer id) {
        this.group = new ArrayList<>();
        if (group != null)
            this.group.addAll(group);
        this.id = id;
    }

    /**
     * Геттер group
     * 
     * @return список студентов группы
     */
    public List<T> getGroup() {
        return this.group;
    }

    /**
     * Геттер groupId
     * 
     * @return значение groupId
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Сеттер groupId
     * 
     * @param groupId новый номер
     */
    public void setGroupId(Integer id) {
        this.id = id;
    }

    /**
     * Метод добавления объекта в группу
     * 
     * @param item объект для добавления
     */
    public void add(T item) {
        this.group.add(item);
    }

    /**
     * Переопределение итератора Student
     */
    @Override
    public Iterator<T> iterator() {
        return new StudentIterator<N, T>(group);

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
    public abstract int compareTo(StudentCollection<N, T> students);
}
