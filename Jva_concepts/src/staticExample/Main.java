package staticExample;

public class Main {

    public static void main(String[] args) {
        Human kunal=new Human(22,"kushwaha",10000,true);
        Human rohit=new Human(23,"jha",10000,false);
        System.out.println(kunal.name);
        System.out.println(Human.population);
        System.out.println(Human.population);

        Main fun=new Main();
        //this is how you create a object using other object
        fun.fun2();


    }

    static void fun(){
//        greeting();
//you cabnnot access non static stuff without referencing their instance in static context
        //hence here im referencing it
        //greeting you need to bring a object
        Main obj=new Main();
        obj.greeting();

    }


    void fun2(){
        greeting();
    }
     void greeting(){   //greeting should be static because non static method inside a static method is not possible
        //non static belong to an instance

        System.out.println("hwllo humans");
    }
}
