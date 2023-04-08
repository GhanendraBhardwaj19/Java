package com.example.printalldup;

import java.util.HashMap;

public class PrintAllDup {
    static String printAllDup(String str1,String str2){

        StringBuilder ans=new StringBuilder();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str2.length();i++){
            hm.put(str2.charAt(i),1);
        }
        for(int i=0;i<str1.length();i++){
            if(hm.get(str1.charAt(i))==null){
                ans.append(str1.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str1="ghanendra";
        String str2="raman";
        System.out.println("The string is:"+printAllDup(str1,str2));
    }
}
