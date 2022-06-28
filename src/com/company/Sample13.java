package com.company;

import java.util.Scanner;

public class Sample13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
                String gender=s.nextLine();
        int age=s.nextInt();
        main(gender,age);
    }
//    public static void Percentage(String gender,int age) {
//        if(gender=="Female" && age>=1 && age<=58){
//            System.out.println("8.2%");
//        }
//        else if(gender=="Female" && age>=59 && age<=100){
//            System.out.println("9.2%");
//        }
//        else if(gender=="Male" &&  age>=1 && age<=58){
//            System.out.println("8.4%");
//        }
//        else{
//            System.out.println("10.5%");
//        }
//    }

    public static void main(String gender,int age) {


        if(gender=="Female" && age>=1 && age<=58){
            System.out.println("8.2%");
        }
        else if(gender=="Female" && age>=59 && age<=100){
            System.out.println("9.2%");
        }
        else if(gender=="Male" &&  age>=1 && age<=58){
            System.out.println("8.4%");
        }
        else{
            System.out.println("10.5%");
        }
//        Percentage(a,b);
    }
}
