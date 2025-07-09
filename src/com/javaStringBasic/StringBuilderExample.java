package com.javaStringBasic;

public class StringBuilderExample 
{
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb.toString());

        sb.insert(5, ",");
        System.out.println("After insert: " + sb.toString());

        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb.toString());

        sb.delete(5, 6);
        System.out.println("After delete: " + sb.toString());
    }
}