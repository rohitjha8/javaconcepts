package Accesors;

public class Subclass extends A{
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj=new Subclass(23,"rio");
        int num=obj.getNum();
        System.out.println(num);
        System.out.println(obj instanceof A);

    }
}
