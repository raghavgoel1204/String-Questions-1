package com.company;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String s = sc.nextLine();

        for (int i=0;i<s.length() ; i++)
        {
            Character c = s.charAt(i);
            if(i%2==0)
                System.out.print(Character.toUpperCase(c));
            else
                System.out.print(Character.toLowerCase(c));
        }

    }
}
