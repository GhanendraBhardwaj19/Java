package com.example.freqofchar;

import java.util.HashMap;
import java.util.Map;

public class FreqOfChar {
    public static void main(String[] args) {
        String name="ghanendrabhardwaj";
        HashMap<Character,Integer> hm=new HashMap<>();
        char arr[]=name.toCharArray();
        for(char ch:arr){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else {
                hm.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> mp:hm.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }
    }
}
