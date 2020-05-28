package com.company;

public class ques15 {
    public static void main(String[] args) {
        String s="15 august is independence day";
        System.out.println("Original : " + s);
        String y= s.replaceAll("15 august", "26 january");
        String x=y.replaceAll("independence","republic");
        System.out.println(x);
    }
}
