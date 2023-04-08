package com.example.greatestfreq;

import java.util.Arrays;

public class GreatestFreq {
    static String getSort(String str){
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    static void getGreatestFreq(String str){
        int freq=0;
        char string[]=getSort(str).toCharArray();
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=1;j<str.length();j++){
               if(string[i]==string[j]){
                   count++;
                   if(freq<=count){
                       freq=count;
                   }
               }
               else if(freq>count){
                   System.out.println(string[i]);
               }



            }

        }
        System.out.println(freq);




    }
    public static void main(String[] args) {
        getGreatestFreq("ghanendra");
    }
}
