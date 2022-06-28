package com.company;
//............... copy   constructor .........................
public class Sample6 {
    int a;
    String s;
    Sample6(int x,String y){
        a=x;
        s=y;
        System.out.println(a+" "+s);
    }
    Sample6(Sample6 ref){
        a=ref.a;
        s=ref.s;
        System.out.println(a+" "+s);

    }

}
class Abc{
    public static void main(String[] args) {
        Sample6 s=new Sample6(100,"dheeraj");
        Sample6 sn=new Sample6(s);


    }
}
