package com.company;
import java.util.Scanner;
public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        System.out.println(s.substring(0,3));
        System.out.println(s.substring(3));

    }
}
