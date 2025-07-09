package com.javaStringBasic;

public class EscapeSpecialCharacters 
{
    public static void main(String[] args) 
    {
        String str = "She said, \"Hello!\"";

        // Replace " with "
        String escaped = str.replace("\"", "\\\"");

        System.out.println("Original: " + str);
        System.out.println("Escaped: " + escaped);
    }
}