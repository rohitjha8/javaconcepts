package Polymorphism;

public class Circle extends Shapes{

    //this will run when object of circle is created
    //hence it is overriding parent method
    @Override  //this is called annotation
    void area(){
        System.out.println("Area is 1/2*b*h ");
    }
}
