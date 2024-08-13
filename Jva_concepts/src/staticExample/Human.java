package staticExample;



public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    static void message(){
        System.out.println("hello world");
    }

    public Human(int age,String name,int salary,boolean married){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.married=married;
        Human.population+=1;
        Human.message();
//this.message(); doesnt work

    }

}
