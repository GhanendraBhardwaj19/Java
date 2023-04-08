package com.example.removechar;

public class RemoveChar {
    static void removeChar(String str){
        String str2=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str2);
    }
    public static void main(String[] args) {
        removeChar("Ghanendra@sharma19876368");
    }
}
