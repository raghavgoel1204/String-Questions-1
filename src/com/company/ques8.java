package com.company;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class ques8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
                System.out.print(Character.toLowerCase(c));
            else
                System.out.print(Character.toUpperCase(c));
        }
    }

}
