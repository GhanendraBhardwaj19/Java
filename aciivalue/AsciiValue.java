package com.exmaple.aciivalue;

public class AsciiValue {
    static void getASCIIValue(char ch){
        char c=ch;
        int ascii=c;
        System.out.println("The ASCII Value Of "+c+" is: "+ascii);
    }
    public static void main(String[] args) {
        getASCIIValue('A');
    }
}
