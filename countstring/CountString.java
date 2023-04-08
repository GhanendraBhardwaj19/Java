package com.exmaple.countstring;

public class CountString {
    public static void main(String[] args) {
        getVowConsSpaces("India won the cricket match");
    }
    static void getVowConsSpaces(String str){
        int vowels=0;
        int consonents=0;
        int spaces=0;
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if (ch >= 'a' && ch <= 'z')
                consonents++;
            else if (ch == ' ')
                spaces++;
        }

        System.out.println("The no. of VOWELS are: "+vowels);
        System.out.println("The no. of CONSONANTS are: "+consonents);
        System.out.println("The no. of SPACES are: "+spaces);
    }
}
