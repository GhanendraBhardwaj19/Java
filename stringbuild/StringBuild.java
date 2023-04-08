package com.example.stringbuild;

import java.util.Scanner;

public class StringBuild {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What's Your Name?");
        String name=sc.nextLine();
        StringBuilder sb=new StringBuilder(name);
        sb.append(" Bhardwaj");
        System.out.println(sb);

    }
}
