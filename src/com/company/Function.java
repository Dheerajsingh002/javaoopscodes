package com.company;

import java.util.Scanner;

public class Function {
public static int print(int a){
    if(a%2==0){
        System.out.println("even");
    }else{
        System.out.println("odd");

    }
return a;
}

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
int a=s.nextInt();
print(a);
}
}