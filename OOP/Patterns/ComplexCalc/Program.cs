
Console.WriteLine(NumParser<ComplexNum>.IsNumeric("")); // false
Console.WriteLine(NumParser<ComplexNum>.IsNumeric("5+")); // false
Console.WriteLine(NumParser<ComplexNum>.IsNumeric("as5"));// false
Console.WriteLine(NumParser<ComplexNum>.IsNumeric("5as"));// false
Console.WriteLine(NumParser<ComplexNum>.IsNumeric("5as5")); // false
Console.WriteLine(NumParser<ComplexNum>.IsNumeric("5++5")); // false
Console.WriteLine(NumParser<ComplexNum>.IsNumeric("5+-5")); // false
Console.WriteLine(NumParser<ComplexNum>.IsNumeric("5--5")); // false

Console.WriteLine(NumParser<ComplexNum>.IsNumeric("5+5")); // true
Console.WriteLine(NumParser<ComplexNum>.IsNumeric("5")); // true

