package com.exmaple.removeparanthesis;

public class RemovePar {
    static void removePar( String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='('&&ch!=')'){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);

    }
    public static void main(String[] args) {
        removePar("(((a-b))+c)");
    }
}
