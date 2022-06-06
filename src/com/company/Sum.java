package com.company;

import java.util.Scanner;

public class Sum {
    public static int sum(int a,int b) {
        int sum = a+b;
        return sum;

    }
    public static void main(String[] args) {
//        int a=10;
//        int b=10;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first number");
int a=s.nextInt();
        System.out.println("enter the second number");
int b=s.nextInt();
        System.out.println("the sum of two nuber is: "+sum(a,b));
}
}