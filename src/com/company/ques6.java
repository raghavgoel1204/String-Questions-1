package com.company;
import com.sun.corba.se.impl.orb.ParserTable;
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
public class ques6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.println("enter the first string");
        s1=sc.nextLine();
        System.out.println("enter the second string");
        s2 = sc.nextLine();
        if(s1.compareTo(s2) > 0)
            System.out.println("first string wins comparison");
        else if(s1.compareTo(s2)==0)
            System.out.println("both stirngs are equal");
        else
            System.out.println("second string wins comparison");
        if(s1.equals(s2))
            System.out.println("t");
        if(s1.equalsIgnoreCase(s2))
            System.out.println("True");
    }
}
