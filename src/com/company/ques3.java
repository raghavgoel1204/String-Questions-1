package com.company;

import java.util.Scanner;

public class ques3 {

    public static void main(String[] args) {
        int count=0;
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) >=65 && s.charAt(i)<=90)
            {
                count++;
            }
            if(Character.isUpperCase(s.charAt(i)))
                c++;
        }
        System.out.println(count);
        System.out.println(c);
    }
}
