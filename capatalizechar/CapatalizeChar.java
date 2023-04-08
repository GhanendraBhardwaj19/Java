package com.example.capatalizechar;

public class CapatalizeChar {
    static String capC(String s){
        return s.toUpperCase();
    }
    static void capChar(String str){
        String word="";
        String first="";
        String second="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                word=word+str.charAt(i);
                char f=word.charAt(0);
                first=first+f;
                second=capC(first);
                word.replace(word.charAt(0),second.charAt(0));

            }
            else{

                System.out.print(" "+word);
                word="";
            }
        }

    }
    public static void main(String[] args) {
        capChar("aman is a cool boy.");
    }
}
