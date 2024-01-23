
/// <summary>
/// Класс для выбора парсера  в зависмости от введенного выражения
/// </summary>
class ParserSelecter
{
    /// <summary>
    /// Список доступных парсеров
    /// </summary>
    readonly List<INumParser<INum>> parsers;
    /// <summary>
    /// Конструктор, заполняет список парсеров
    /// </summary>
    public ParserSelecter()
    {
        parsers = new()
        {
            new RealNumParser(),
            new ComplexNumParser()
        };
    }
    /// <summary>
    /// Парсинг в число введенных данных с проверкой
    /// </summary>
    /// <param name="input">Строка с введенными данными</param>
    /// <returns>INum или null в случае неуспеха</returns>
    public INum GetNum(string input)
    {
        foreach (var parser in parsers)
        {
            if (parser.IsValid(input)) return parser.ToNum(input);
        }
        return null!;
    }



}



