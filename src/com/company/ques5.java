package com.company;
import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int count=1;
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == 32)
                count++;
        }
        System.out.println(count);
    }
}
