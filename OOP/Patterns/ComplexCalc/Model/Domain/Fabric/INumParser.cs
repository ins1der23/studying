namespace Domain;
interface INumParser<INum> 
{
    bool IsValid(string num);
    INum ToNum(string checkedInput);
}