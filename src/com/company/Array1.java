package com.company;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int total=0;
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
            total=total+arr[i];
        }
        System.out.println(total);



    }
}
