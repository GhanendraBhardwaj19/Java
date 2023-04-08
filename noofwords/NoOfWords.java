package com.example.noofwords;

public class NoOfWords {
    public static void main(String[] args) {
        String str="ghanendra reads books";
        int words=1;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
             if(ch==' '){
                words++;
            }
        }
        System.out.println(words);
    }
}
