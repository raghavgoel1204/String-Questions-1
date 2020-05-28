package com.company;
import java.util.Scanner;

public class ques15Trim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        System.out.println("original String " + s + ".");
        System.out.println(s.trim());

    }
}
