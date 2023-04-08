package com.example.anramstring;

import java.util.Arrays;

public class AngramString {
    static String getSort(String str){
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    static boolean isAnagram(String str1,String str2){
        String first=getSort(str1);
        String second=getSort(str2);

        if(str1.length()!=str2.length()) return false;
        if(first.compareTo(second)==0){
            return  true;
        }
        return false;

    }
    public static void main(String[] args) {
        boolean res=isAnagram("INTEGER","TEGERNI");
        if(res==true){
            System.out.println("yes!");
        }else {
            System.out.println("No!");
        }
    }
}
