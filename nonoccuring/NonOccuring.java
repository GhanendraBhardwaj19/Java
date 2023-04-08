package com.example.nonoccuring;

import com.example.charoccur.CharOccur;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class NonOccuring {
    static void findOccurance(String str){
        HashSet<Character> s=new HashSet<>();
        for (int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            if(s.contains(currchar)==false){
                s.add(currchar);
            }
            else {
                s.remove(currchar);
            }

        }
        Iterator it=s.iterator();
        while (it.hasNext()){
            System.out.print(" "+it.next());
        }

    }
    public static void main(String[] args) {
        findOccurance("ghanendra");
    }
}
