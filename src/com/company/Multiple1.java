package com.company;

import java.util.Scanner;

public class Multiple1 {
    public static int multiple(int a,int b) {
        int multiple=a*b;
        return multiple;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the first number: ");
        int a=s.nextInt();
        System.out.print("enter the second number: ");
        int b=s.nextInt();
        System.out.println("multiple of two number is: "+multiple(a,b));

    }
}
