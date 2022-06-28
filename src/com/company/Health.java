package com.company;

public class Health {
    String name;
    double height;
    double width;
    Health(String x,double y,double z){
        name=x;
        height=y;
        width=z;
        double BMI;
        BMI=(width)/(height*height);
        System.out.println(BMI);
    }

}
class XYZ{
    public static void main(String[] args) {
        Health s=new Health("dheeraj",6.5,60);
    }

}
