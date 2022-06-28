package com.company;

import java.util.Scanner;

public class Stringss {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = a.substring(0, a.indexOf('@'));
        System.out.println("username: "+b);
//        boolean  b=a.endsWith("@gmail.com");
//        if(b==true){
//            System.out.println(a);
//        }
//        else{
//            System.out.println("wrong id");
//        }
//
//    }
    }
}
