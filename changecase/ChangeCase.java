package com.example.changecase;

public class ChangeCase {
    public static void main(String[] args) {
        String str="this IS Ghanendra";
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length();i++){
            int ascii=(int)(str.charAt(i));
            if(ascii>=65&&ascii<=90){
               ans.append((char)(ascii+32)) ;
            }
            else if(ascii>=97&ascii<=122){
                ans.append((char)(ascii-32)) ;
            } else if (str.charAt(i)==' ') {
                ans.append(' ');
            }
        }
        System.out.println(ans.toString());
    }
}
