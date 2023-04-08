package com.example.maxcount;

import java.util.HashMap;
import java.util.Map;

public class MaxCount {
    public static void main(String[] args) {
        String name="mehtasahab";
        HashMap<Character,Integer> hm=new HashMap<>();
        char arr[]=name.toCharArray();
        for(char ch:arr){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        char maxChar=' ';
        int maxCount=0;
        for(Map.Entry<Character,Integer> mp:hm.entrySet()){
            if(maxCount< mp.getValue()){
                maxCount=mp.getValue();
                maxChar=mp.getKey();
            }
        }
        System.out.println("The maximum occurring element is: "+maxChar);
    }
}
