package com.company;

import java.util.Scanner;

public class Sample12 {
    String s1;
    String s2;
    Sample12(String a,String b){
        s1=a;
        s2=b;
    }
    void print(){
        if(s1=="GLA" && s2=="Mathura"){
            System.out.println("GLA University Mathura");
        }
        else{
            System.out.println("AAA Technologies Delhi");
        }
    }
}
class Sam{
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            Sample12 r=new Sample12("GLA","Mathura");
        r.print();
    }
}
