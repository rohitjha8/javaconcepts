package com.rohit.introduction;

public class Main {
    public   static void  main(String[] args) {
//      int [] num=new int[5];
//      String [] names=new String[5];
//      Student kunal;// this refernce varible kunal is of type student which our owrn datatype

        Student s1=new Student();
        s1.rollno=45;
        System.out.println(s1.rollno);


    }}
    class Student{
        String name;
        int rollno;
        float marks;
    }
