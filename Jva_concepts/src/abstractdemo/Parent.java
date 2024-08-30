package abstractdemo;

public abstract class Parent{
    int age;
    final int VALUE;
    public Parent(int age,int value) {
        this.age = age;
        this.VALUE=value;
    }
    static void hello(){
        System.out.println("i m static method in abstract class");
    }
    void normal(){
        System.out.println("im a normal method");
    }
    abstract void carrer();//this abstract methods are overriden in child method
    abstract void partner();
}
