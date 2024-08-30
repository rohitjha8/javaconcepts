package abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(30,34);
        son.carrer();
        son.normal();
        Parent daughter=new Daughter(10,78);

        daughter.carrer();
        System.out.println(daughter.VALUE);

        Parent.hello();
    }
}
