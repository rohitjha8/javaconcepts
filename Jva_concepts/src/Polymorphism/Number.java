package Polymorphism;

public class Number {
    void sum(int a,int b){

    }
    void sum(int a,int b,int c){

    }

    public static void main(String[] args) {
        Number obj =new Number();
        obj.sum(1,3);
        obj.sum(1,2,3);
    }
}
