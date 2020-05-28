package com.company;
import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] s = new String[5];
        System.out.println("enter names");
        for(int i=0;i<5;i++)
        {
            System.out.println(i+1 + " name is : ");
            s[i] = sc.nextLine();
        }
        int count =0;
        for(int i=0;i<5;i++)
        {
            char c=Character.toLowerCase(s[i].charAt(0));
            if(c =='a' || c =='e' || c == 'i' || c== 'o' || c=='u' ){
                System.out.println("Sting starts with vovel : " + s[i]);
                count++;
            }
            else
            {
                System.out.println("not started with vovel");
            }
        }
    }
}
