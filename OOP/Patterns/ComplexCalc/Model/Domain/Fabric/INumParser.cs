namespace Domain;
public interface INumParser<T> where T : INum
{
    bool IsValid(string num);
    T ToNum(string checkedInput);
}