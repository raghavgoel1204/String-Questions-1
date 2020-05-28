package com.company;

import java.util.Scanner;

public class ques24 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String country[] ={"india","France","brazil","Jordan","china","peru","italy"};
        String wonder[] = {"tajmahal","Efieltower","Christ the redeemer","petra","the great wall of china AND CORONA ", "Macchu Picchu" , "Colosseum"};
        String cn;
        int i;
        System.out.println("Enter any country name is to be serach");
        cn = sc.nextLine();
        for( i =0 ;i<7 ;i++) {
            if (country[i].equalsIgnoreCase(cn)) {
                System.out.println(wonder[i]);
            }
        }
    }
}
