package com.company;

import java.util.Scanner;

public class Number {
    public static int Number(int n) {
        int arr[]=new int[n];
        for (int i=0;i<=n;i++){
            Scanner s=new Scanner(System.in);
            arr[i]=s.nextInt();
            System.out.println(arr[i]);
        }
        return n;

    }

    public static void main(String[] args) {
//        Number(n);
    }
}
