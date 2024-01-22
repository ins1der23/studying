using Domain;

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
    /// Конструтктор, заполняет список парсеров
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
    /// <returns>Числовой класс/null</returns>
    public INum GetNum(string input)
    {
        RealNumParser realNumParser = new();
        ComplexNumParser complexNumParser = new();
        if (complexNumParser.IsValid(input)) return complexNumParser.ToNum(input);
        if (realNumParser.IsValid(input)) return realNumParser.ToNum(input);


        // foreach (var parser in parsers)
        // {
        //     if (parser.IsValid(input)) return parser.ToNum(input);
        // }
        return null!;
    }



}



