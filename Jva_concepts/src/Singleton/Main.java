package Singleton;

public class Main {
    public static void main(String[] args) {
    Singleton obj= Singleton.getInstance();
        Singleton obj2= Singleton.getInstance();
        Singleton obj3= Singleton.getInstance();

        // all three ref variable are pointing to the just one object]

    //cant access it because it is private obj.num;


    }
}
