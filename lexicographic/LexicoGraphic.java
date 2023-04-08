package com.example.lexicographic;

public class LexicoGraphic {
    static String lexicoGraphic(String name){
        StringBuilder ans=new StringBuilder();
        char a;
        int b;
        char arr[]=name.toCharArray();
        for (int i=0;i<arr.length;i++){
            int ascii = (int)(arr[i]);
            if (ascii == 90)
                arr[i] = (char)65;

    else if (ascii == 122)
                arr[i] = (char)(97);
                if ((ascii >= 65 && ascii < 90) || (ascii >= 97 && ascii < 122)){
                arr[i] = (char)(ascii + 1);
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String str1="ghanedndra";
        System.out.println("The string is: "+lexicoGraphic(str1));
    }
}
