package Service.Interfaces;

public interface IPersonCreate<N extends Number>
 {
     void create(String name, N age, String acadDegree);
}
