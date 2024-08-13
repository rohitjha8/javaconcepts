package staticExample;
//this is a demo to show initialization of static variable or static block

public class StaticInt {
    static int a=10;
    static int b;

//static block only run once when the object is created
    static{
        System.out.println("im a static block");
        b=4*a;
    }

    public static void main(String[] args) {
        StaticInt obj=new StaticInt();
        System.out.println(obj.a +" "+obj.b);
        b+=20;
        System.out.println(obj.a +" "+obj.b);
        StaticInt obj2=new StaticInt();
        System.out.println(obj.a +" "+obj.b);

    }

}
