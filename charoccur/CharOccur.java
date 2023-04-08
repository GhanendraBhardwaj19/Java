package com.example.charoccur;

import java.util.Arrays;

public class CharOccur {
    static void getOccurance(String str){

        char arr[]=str.toCharArray();
        boolean visited[]=new boolean[str.length()];
        Arrays.sort(arr);
        for(int i=0;i<str.length();i++){
            int count=1;
            if(visited[i]==true)
                continue;

            for(int j=i+1;j<str.length();j++){

                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;


                }



            }
            System.out.println(arr[i]+"="+count);


        }

    }
    public static void main(String[] args) {
        getOccurance("ABAACDC");
    }
}
