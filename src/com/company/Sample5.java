package com.company;
//Default constructor***********************************
public class Sample5 {
    int a;
    String s;
    Sample5()
    {
        a=100;
        s="Dheeraj";
    }
    void print(){
        System.out.println(a);
        System.out.println(s);
    }
}
class B{
    public static void main(String[] args) {
        Sample5 sn=new Sample5();
        sn.print();
    }
}
