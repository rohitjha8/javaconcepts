package abstractdemo;

public  class Son extends Parent{
    public Son(int age,int value) {
        super(age,value);

//        this.age=age;
    }

    @Override
    void carrer() {
        System.out.println("I love ");
    }

    @Override
    void partner() {
        System.out.println("I love she is");
    }
}
