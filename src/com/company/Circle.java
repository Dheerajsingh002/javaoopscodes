package com.company;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the radius of circle: ");
        int r=s.nextInt();
        float pie=3.14f;
        System.out.println("area of circle is: " + pie*r*r);
    }
}
