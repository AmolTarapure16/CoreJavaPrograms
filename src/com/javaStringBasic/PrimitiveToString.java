package com.javaStringBasic;

public class PrimitiveToString 
{
    public static void main(String[] args) 
    {
        int num = 100;
        double pi = 3.14;
        boolean flag = true;

        String strNum = String.valueOf(num);
        String strPi = String.valueOf(pi);
        String strFlag = String.valueOf(flag);

        System.out.println("int to String: " + strNum);
        System.out.println("double to String: " + strPi);
        System.out.println("boolean to String: " + strFlag);
    }
}