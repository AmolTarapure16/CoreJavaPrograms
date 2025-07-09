package com.javaStringBasic;

public class RemoveDuplicateChars 
{
    public static String removeDuplicates(String str) 
    {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) 
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) 
    {
        System.out.println(removeDuplicates("programming"));
    }
}
