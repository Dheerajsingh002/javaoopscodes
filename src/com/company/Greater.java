package com.company;

import java.util.Scanner;

public class Greater {
    public static int Great(int a, int b) {
        if (a > b) {
            System.out.println(a);
            return a;
        } else {
            System.out.println(b);
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        Great(a, b);
    }
}
