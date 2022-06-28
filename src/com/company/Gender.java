package com.company;


import java.util.Scanner;

public class Gender {
    int age;
    String gender;
    Gender(String  g,int a){
        gender=g;
        age=a;

    }
    void print(){
        if(gender.equals("Female") && age>=1 && age<=58){
            System.out.println("8.2%");
        }
        else if(gender.equals("Female") && age>=59 && age<=100){
            System.out.println("9.2%");
        }
        else if(gender.equals("Male") &&  age>=1 && age<=58){
            System.out.println("8.4%");
        }
        else{
            System.out.println("10.5%");
        }
    }

}
class GHJ{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the gender: ");
        String g=s.nextLine();
        System.out.println("enter the age: ");
        int a=s.nextInt();
        Gender r=new Gender(g,a);
        r.print();
    }
}
