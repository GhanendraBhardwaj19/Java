package com.exmaple.largestword;

public class LargestWord {
    static int checkLength(String str){
        return str.length();
    }
    static void LargestString(String str){
        int l=0;
        String word="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch==' ') {

                int len=checkLength(word);
                if(len>l){
                    l=len;
                    System.out.println(word);
                }
                word="";
            }
            else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                word+=ch;
            }
//            else if (ch==' ') {
//                System.out.println(word);
//                word="";
//            }
        }
    }
    public static void main(String[] args) {
        String name= "gag reads books";
        LargestString(name);
    }
}
