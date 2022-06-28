package com.company;

public class Sample11 {
    int a ;
    Sample11(int a){
       this.a=a;

        }
        void print(){
            System.out.println(a);
        }

    }
    class Mains{
        public static void main(String[] args) {
            Sample11 s=new Sample11(10);
            s.print();
        }


}
