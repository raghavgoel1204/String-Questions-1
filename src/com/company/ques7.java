package com.company;
import java.util.Scanner;
public class ques7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the stirng");
        String s=sc.nextLine();
        int d;
        if(s.equalsIgnoreCase("Monday"))
            d=1;
        else if(s.equalsIgnoreCase("Tuesday"))
            d=2;
        else if(s.equalsIgnoreCase("Wednesday"))
            d=3;
        else if(s.equalsIgnoreCase("Thursday"))
            d=4;
        else if(s.equalsIgnoreCase("Friday"))
            d=5;
        else if(s.equalsIgnoreCase("Saturday"))
            d=6;
        else if(s.equalsIgnoreCase("Sunday"))
            d=7;
        else
            d=-1;
        if(d!=-1)
            System.out.println("day  no is " + d);
        else
            System.out.println("invalid input" );


    }
}
