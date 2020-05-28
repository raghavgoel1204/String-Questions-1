package com.company;

import java.util.Scanner;

public class ques4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {

            char c=Character.toLowerCase(s.charAt(i));
            if(c =='a' || c== 'e' ||c=='i' || c=='o' || c=='u' )
                count++;
        }
        System.out.println(count);
    }
}
