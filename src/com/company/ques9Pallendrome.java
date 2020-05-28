package com.company;
import java.util.Scanner;

public class ques9Pallendrome{

   static boolean isPal(String s,int f,int l)
    {
        if(f>=l)
            return true;
        if( s.charAt(f) != s.charAt(l))
            {
                return false;
            }
            return isPal(s, f + 1, l - 1);
    }

        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        int n=s.length();
        boolean x=isPal(s,0,n-1);
            System.out.println(x);
    }


}
