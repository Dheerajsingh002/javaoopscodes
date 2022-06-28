package com.company;

import java.util.Scanner;

public class Lecture13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        StringBuffer b=new StringBuffer(a);
        for (int i=0;i<b.length()/2;i++)
        {
            int front=i;
            int back=b.length()-1-i;
            char frontchar=b.charAt(front);
            char backchar=b.charAt(back);
            b.setCharAt(front,backchar);
            b.setCharAt(back,frontchar);
        }
        System.out.println(b);
    }
}
