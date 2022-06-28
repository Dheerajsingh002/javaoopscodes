package com.company;

import java.util.Scanner;

public class Age {
    public static int age(int a) {
        if(a>=18){
            System.out.println("eligible for vote");
        }
        else
        {
            System.out.println("not eligible for vote");
        }
return a;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        age(a);
    }
}
