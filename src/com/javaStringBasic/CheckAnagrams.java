package com.javaStringBasic;
import java.util.Arrays;

public class CheckAnagrams 
{
    public static boolean areAnagrams(String s1, String s2) 
    {
        if (s1.length() != s2.length()) 
        {
            return false;
        }

        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) 
    {
        String s1 = "listen";
        String s2 = "silent";

        if (areAnagrams(s1, s2)) 
        {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else 
        {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }
}