package com.company;
import java.util.Scanner;

public class ques19 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("enter the string");
        String s1=sc.nextLine();
        String  s = " " + s1;
        String r="";
        char ch;
        for(int i=0;i<s.length();i++)
        {
           ch=s.charAt(i);
            if(ch == ' ')
            {
                r = r + ch;
                i++;
                ch = Character.toUpperCase(s.charAt(i));
            }
            else
                ch = Character.toLowerCase(s.charAt(i));
            r = r + ch;

        }
        System.out.println(r.substring(1));
    }
}
