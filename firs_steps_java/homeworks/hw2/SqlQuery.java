
// Дана строка sql-запроса:

// select * from students where "
// Сформируйте часть WHERE этого запроса, используя StringBuilder. Пример данных для фильтрации приведены ниже в виде json-строки. 
// Если значение null, то параметр не должен попадать в запрос.

// Пример:

// {"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
// Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

// String QUERY - начало SQL-запроса
// String PARAMS - JSON с параметрами

// Результат: "select * from students where name='Ivanov' and country='Russia' and city='Moscow'"

import java.util.ArrayList;

public class SqlQuery {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"null\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(queryBuilderSimple(QUERY, PARAMS));
    }

    public static StringBuilder queryBuilderSimple(String QUERY, String PARAMS) {
        StringBuilder sb = new StringBuilder();
        for (char c : PARAMS.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                sb.append(c);
            else if (c == ':')
                sb.append("='");
            else if (c == ',')
                sb.append("' ");
        }
        sb.append("'");
        String[] temp = sb.toString().split(" ");
        sb = new StringBuilder();
        sb.append(QUERY);
        for (String string : temp) {
            if (!string.contains("null"))
                sb.append(string).append(" and ");
        }
        String result = sb.toString().trim();
        if (result.endsWith("and"))
            result = sb.toString().substring(0, result.length() - 3);
        sb = new StringBuilder();
        sb.append(result);
        return sb;
    }

    public static StringBuilder queryBuilder(String QUERY, String PARAMS) {
        String[] temp = PARAMS.split(" ");
        ArrayList<String> finalStrings = new ArrayList<String>();
        for (String item : temp) {
            if (!item.contains("null")) {
                finalStrings.add(item);
            }
        }
        for (int index = 1; index < finalStrings.size(); index++) {
            StringBuilder sb = new StringBuilder();
            sb.append("and ").append(finalStrings.get(index));
            finalStrings.set(index, sb.toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(QUERY).append(" ");
        for (String string : finalStrings) {
            for (char c : string.toCharArray()) {
                if (Character.isLetterOrDigit(c))
                    sb.append(c);
                else if (c == ':')
                    sb.append("='");
                else if (c == ' ')
                    sb.append(" ");
                else if (c == ',')
                    sb.append("");
            }
            sb.append("' ");
        }
        return sb;
    }
}
