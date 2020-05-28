package com.company;
import java.util.Scanner;

public class ques12Male {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String s=sc.nextLine();
        System.out.print("Gender is : ");
        String x=s.toLowerCase();
        if(x.startsWith("mr") )
            System.out.print("Male");
        else if(x.startsWith("miss"))
            System.out.print("Female");
        else if(x.startsWith("mrs"))
            System.out.print("Married Female");
        else if(x.endsWith("Kumari"))
            System.out.print("Female");
        else
            System.out.print("Others");
    }
}
