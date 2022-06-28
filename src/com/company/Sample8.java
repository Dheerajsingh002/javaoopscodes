package com.company;
//.................. parameterized constructor.............
public class Sample8 {
    int a;
    int b;
    Sample8(int x,int y){
        a=x;
        b=y;
        System.out.println(a);
        System.out.println(b);
    }
}
class Abr{
    public static void main(String[] args) {
        Sample8 s=new Sample8(100,300);

    }
}
