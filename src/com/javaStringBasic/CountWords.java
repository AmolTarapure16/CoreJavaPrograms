package com.javaStringBasic;

public class CountWords 
{
    public static void main(String[] args) 
    {
        String sentence = "This is a simple sentence";

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Number of words: " + words.length);
    }
}