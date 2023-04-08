package com.example.removedup;

public class RemoveDup {
    static String newString(String name){
        String newstr="";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(newstr.indexOf(ch)== -1){
                newstr+=ch;
            }

        }
        return newstr;
    }
    public static void main(String[] args) {
        String name="dildeewana";
        System.out.println("The old string is: "+name);
        System.out.println("The new string is: "+newString(name));
    }
}
