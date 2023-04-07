
using System;
using System.Text;
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// создать массив из 200 строк
// задать ячейки массиа
// выполнить сравнение ячеек

string LongestCommonPrefix(string[] strs)
{
    int size = strs.Length;
    int minLength = strs[0].Length;
    int minIndex = 0;
    for (int i = 1; i < size; i++)
    {
        if (strs[i].Length < minLength)
        {
            minLength = strs[i].Length;
            minIndex = i;
        }
    }
    char[] compare = strs[minIndex].ToCharArray();
    char[] result = new char[minLength];
    for (int i = 0; i < minLength; i++)
    {
        int count = 0;
        foreach (var item in strs)
        {
            if (item[i] == compare[i]) count++;
        }
        if (count == size) result[i] = compare[i];
        else break;
    }
    string output = String.Empty;
    foreach (var item in result)
    {
        if (item != 0) output += item;
    }
    return output;
}

string[] words = { "circle", "cir", "cirjs" };
Console.WriteLine(LongestCommonPrefix(words));
