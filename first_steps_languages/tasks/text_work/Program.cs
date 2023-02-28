using System.Xml;
using System.Net.Mime;
string GetHtml(string url, string path)
{

    string html = String.Empty;
    if (!File.Exists(path))
    {
        html = new HttpClient().GetStringAsync(url).Result;
        File.WriteAllText(path, html);
    }
    else
    {
        html = File.ReadAllText(path);
    }

    return html;
}

string url = "https://e1.ru";
string path = "text.txt";
string e1 = GetHtml(url, path);
// System.Console.WriteLine(e1);
Console.WriteLine(e1.IndexOf("<title>"));
Console.WriteLine(e1.IndexOf("</title>"));

string TextBetween(string site, string Begin, string End)
{
    int fisrtBound = site.IndexOf(Begin) + 7;
    int length = (site.IndexOf(End) - fisrtBound);
    string result = site.Substring(fisrtBound, length);
    return result;
}

string title = TextBetween(e1, "<title>", "</title>");
System.Console.WriteLine(title);

string GetLetter(string message)
{
    Console.Write(message);
    return (Console.ReadLine());
}

string name = GetLetter("Напишите первую букву имени ");

    if (name.ToLower() == "д")  System.Console.WriteLine("Привет, Даня");
    else System.Console.WriteLine("Привет кто-то");
   

