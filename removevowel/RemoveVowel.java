package com.example.removevowel;

public class RemoveVowel {
    static void removeVowel(String str){
        str.toLowerCase();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                str=str.substring(0,i)+str.substring(i+1,str.length());
            }

        }
        System.out.println(str);

    }
    public static void main(String[] args) {
        removeVowel("take u forward");
    }
}
