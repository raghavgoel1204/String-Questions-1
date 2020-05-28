package com.company;
import java.util.Scanner;

public class ques11Piglatin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int x=0,f=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u'|| c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
            {
                f=1;
                x=i;
                String m =  s.substring(x) +s.substring(0,x)  + "ay";
                System.out.println(m);
                return;
            }

        }
        if(f==0)
        {
            System.out.println("no vovels found");
        }

    }
}