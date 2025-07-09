package com.javaStringBasic;

public class JoinStrings 
{
    public static void main(String[] args) 
    {
        String[] words = {"Java", "Python", "C++"};

        String joined = String.join(", ", words);

        System.out.println("Joined string: " + joined);
    }
}