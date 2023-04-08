package com.example.printdup;

import java.util.HashMap;
import java.util.Map;

public class PrintDup {
    public static void main(String[] args) {
        String name="jethalal";
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
        for(Map.Entry<Character,Integer> mp: hm.entrySet()){

               if(mp.getValue()>1){
                   System.out.print(" "+mp.getKey());
               }

        }
    }
}
