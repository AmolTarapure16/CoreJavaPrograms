
package com.javaStringBasic;

public class CapitalizeFirstLetter 
{
    public static String capitalize(String str) 
    {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) 
        {
            if (w.length() > 0) 
            {
                sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) 
    {
        System.out.println(capitalize("the quick brown fox"));
    }
}
