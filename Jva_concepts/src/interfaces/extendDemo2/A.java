package interfaces.extendDemo2;

public interface A {
//static method in interface should always have body
    //it will be called via interface name
static void greeting(){
    System.out.println("Hey iam static method");
}
    default void fun(){
        System.out.println("im in a");
    };
}
