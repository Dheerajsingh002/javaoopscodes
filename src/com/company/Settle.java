package com.company;

public class Settle{
    private String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Settlemain{
    public static void main(String[] args) {
        Settle s=new Settle();
        s.setName("dheeraj");
        System.out.println(s.getName());
        s.setAge(18);
        System.out.println(s.getAge());

    }
}