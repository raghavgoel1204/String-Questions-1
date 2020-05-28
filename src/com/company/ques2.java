package com.company;
import java.util.Scanner;

public class ques2 {

    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

            System.out.println("enter the first name");
            String name=sc.next();

            System.out.println("enter the middle name");
            String name1=sc.next();

            System.out.println("enter the last name");
            String name2=sc.next();

            System.out.println("My name is " + name + " " + name1 + " " + name2 );
            String s=name.charAt(0) + ". " + name1.charAt(0) + ". " + name2.charAt(0) + ". " ;
            System.out.println("My name short form is " + s);
    }
}
