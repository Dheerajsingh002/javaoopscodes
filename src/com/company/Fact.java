package com.company;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double Fact = 1;
        for (int i = 1; i <= n; i++) {
               Fact*=i;
        }
        System.out.println(Fact);


    }
}