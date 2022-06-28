package com.company;

public class Sample10 {
    public static void main(String[] args) {
        E r=new E();
    }

}
class D {     //super class
    D(int a) {
            System.out.println("hello dheeraj"+" "+a);
    }
}
    class E extends D{  // sub class
        E(){
            super(12);

                System.out.println("hello");
        }

    }



