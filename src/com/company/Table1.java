package com.company;

import java.util.Scanner;

public class Table1 {
    public static int Table(int n) {
        for (int i = 1;i <=10;i++){
            System.out.println(n + "*" + i + "=" + n * i);
        }
return n;
}   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
Table(n);
}
}