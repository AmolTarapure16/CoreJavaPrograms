package com.javaStringBasic;

public class ReplaceCharSubstring 
{
    public static String replaceChar(String str, char oldChar, char newChar) 
    {
        return str.replace(oldChar, newChar);
    }
    
    public static String replaceSubstring(String str, String oldSub, String newSub) 
    {
        return str.replace(oldSub, newSub);
    }
    
    public static void main(String[] args) {
        System.out.println(replaceChar("hello", 'l', 'p'));
        System.out.println(replaceSubstring("hello world", "world", "java"));
    }
}
