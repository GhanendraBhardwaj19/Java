package com.exmaple.removespaces;

public class RemoveSpaces {
    static void removeSpaces(String str){
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                str=str.substring(0,i)+str.substring(i+1,str.length());
            }

        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        removeSpaces("take u forward");
    }
}
