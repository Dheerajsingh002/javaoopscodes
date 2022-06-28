package com.company;
class Student{
   private String name;
    private int age;
//    float height;
    void setvalue(String n)
    {
        name=n;
    }
    String getname()
    {
        return name;
    }
    void setvalue(int a){
         age=a;
}
int getage()
{
return age;
}
//void setvalue(float h){
//        height=h;
//
//}
//public void printvalue(){
//    System.out.println(name);
//    System.out.println(age);
////    System.out.println(height);
//}
}

 class Setter {
    public static void main(String[] args) {
        Student s=new Student();
        s.setvalue(12);
        System.out.println(s.getage());
        s.setvalue("dheeraj");
        System.out.println(s.getname());
//        s.printvalue();


    }
}
