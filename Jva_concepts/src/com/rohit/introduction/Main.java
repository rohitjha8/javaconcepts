package com.rohit.introduction;

public class Main {
    public   static void  main(String[] args) {
//      int [] num=new int[5];
//      String [] names=new String[5];
//      Student kunal;// this refernce varible kunal is of type student which our owrn datatype

        Student s1=new Student("rohit",23,78.5f);
//        s1.rollno=45;
//        s1.marks=5.5f;
//        s1.name="rohit";
//        s1.changename("jha");
//        s1.greeting();

        System.out.println(s1.rollno);
        System.out.println(s1.marks);
        System.out.println(s1.name);


        Student one = new Student();
        Student two=one;
        one.name="something0";
        System.out.println(two.name);

        Student random=new Student(s1);
        System.out.println(random.name);

        Student random2=new Student();



    }}
    class Student{
        String name;
        int rollno;
        float marks;
        void greeting(){
            System.out.println("hello my name is " + this.name);
        }
        void changename(String newname){
            name=newname;
            //this.name=name;
        }
        Student (Student other){
            this.name=other.name;
        }
        Student(){
//            this.rollno=45;
//            this.marks=5.5f;
//            this.name="rohit";
            //this is how you call a constructor from another constructor
            //internaly new Student();
            this("randodm2",34,98.5f);
        }
        //when you call a constructor with 3 values it will call this or the above one wiht 0 vlaue
        //Student arpit=new Student("rhit",7,900)
        //here this will be replaced by arpit

        Student(String naam,int roll,float mark){
            rollno=roll;
            //this.rollno=rollno;// this will work
            name=naam;
            marks=mark;
        }
    }
