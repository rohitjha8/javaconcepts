package abstractdemo;

public class Daughter extends Parent{
    public Daughter(int age,int value) {
        super(age,value);

       // this.age=age;
    }

    @Override
    void normal() {
            super.normal();
    }

    @Override
    void carrer() {
        System.out.println("i am going to be doctor");
    }

    @Override
    void partner() {
        System.out.println("i love barbie");
    }
}
