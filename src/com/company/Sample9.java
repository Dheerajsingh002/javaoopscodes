package com.company;

public class Sample9 {
    public static void main(String[] args) {
      C r=new C();
      r.show();
    }


}
class A{                   //super class
    int a=100;
}
class C extends A{            //sub class
    int a=200;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }


}
