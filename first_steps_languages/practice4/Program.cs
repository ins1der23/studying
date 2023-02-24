using System.Net.Http;
using System.Net;

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

string url = "https://google.com";
string localPath = "gglcom.html";
string html = GetHtml(url, localPath);
// Console.WriteLine(html);


Console.WriteLine(html.IndexOf("<title>")); // 768
Console.WriteLine(html.IndexOf("</title>")); // 781

string TextBetween(string Begin, string End)
{
    int fisrtBound = html.IndexOf(Begin);
    int length = (html.IndexOf(End) - fisrtBound);
    string result = html.Substring(fisrtBound, length);
    return result;
}


string title = TextBetween("<title>", "</title>" );
System.Console.WriteLine(title);

// Console.WriteLine(s.Substring(4, 7)); // ometohe