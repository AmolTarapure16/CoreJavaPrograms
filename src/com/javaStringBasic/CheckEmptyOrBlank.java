package com.javaStringBasic;

public class CheckEmptyOrBlank 
{
    public static void main(String[] args) 
    {
        String emptyStr = "";
        String blankStr = "   ";
        String nonEmpty = "Java";

        System.out.println("emptyStr isEmpty(): " + emptyStr.isEmpty());

        // isBlank() is available from Java 11 onwards
        System.out.println("emptyStr isBlank(): " + emptyStr.isBlank());
        System.out.println("blankStr isBlank(): " + blankStr.isBlank());
        System.out.println("nonEmpty isBlank(): " + nonEmpty.isBlank());
    }
}