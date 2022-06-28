package com.company;
//.................. Private Constructor...................................
public class Sample7 {
    int a;
    int b;
   private Sample7(int x,int y){
        a=x;
        b=y;
    }
    void print(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Sample7 s=new Sample7(100,200);
        s.print();
    }
}
//class Acd{
//    public static void main(String[] args) {
//        Sample7 s=new Sample7(100,200);
//        s.print();
//    }
//}
