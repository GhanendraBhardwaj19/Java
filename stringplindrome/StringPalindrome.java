package com.example.stringplindrome;

public class StringPalindrome {
    static String getReverse(String str){
        int end=str.length()-1;
        String str2="";

        while (end>=0){
          str2=str2+str.charAt(end);
          end--;

        }
        return str2;


    }
    public static void main(String[] args) {
        String s = "ABCDCBA";
        String res = getReverse(s);
        if (res.compareTo(s) == 0) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }
}
