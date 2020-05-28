package com.company;
import java.util.Scanner;

public class ques13Dict {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String s1=sc.nextLine();
        System.out.println("enter next string");
        String s2=sc.nextLine();
        int c=s1.compareToIgnoreCase(s2);
        System.out.println("lexical order is :");
        if(c>0){
            System.out.println(s2);
            System.out.println(s1);
        }
        else if(c==0)
        {
            System.out.println("both are having same charachters");
        }
        else{
            System.out.println(s1);
            System.out.println(s2);
        }

    }
}
