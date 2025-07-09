
package com.javaStringBasic;

public class IndexOfCharSubstring 
{
    public static int indexOfChar(String str, char ch) 
    {
        return str.indexOf(ch);
    }
    
    public static int indexOfSubstring(String str, String sub) 
    {
        return str.indexOf(sub);
    }
    
    public static void main(String[] args) 
    {
        System.out.println(indexOfChar("hello", 'e'));
        System.out.println(indexOfSubstring("hello world", "world"));
    }
}
