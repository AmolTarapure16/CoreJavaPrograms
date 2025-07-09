
package com.javaStringBasic;

public class ReverseWordOrder {
    public static String reverseOrder(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length -1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(reverseOrder("The quick brown fox"));
    }
}
