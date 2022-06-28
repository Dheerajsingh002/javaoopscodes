package com.company;

import java.util.Scanner;

public class Healthfun {
    public static double computeBMI(String name,double height,double weight) {
        double BMI;
        BMI=(weight)/(height*height);
        System.out.println("BMI IS: "+BMI);
        return BMI;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the patient name: ");
        String a=s.nextLine();
        System.out.println("enter the height of patient: ");
        double b=s.nextDouble();
        System.out.println("enter the weight of patient: ");
        double c=s.nextDouble();
        computeBMI(a,b,c);


    }
}
