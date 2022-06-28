package com.company;

import java.util.Scanner;

public class Person2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] arr=new String[n];

        for (int i=0;i<arr.length;i++){
           arr[i]=s.nextLine();
        }
        for (int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}
