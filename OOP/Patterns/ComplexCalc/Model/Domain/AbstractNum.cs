abstract class AbstractNum
{
    public AbstractNum GetInstance() => this;
    public abstract AbstractNum ToNum(string checkedInput);
}