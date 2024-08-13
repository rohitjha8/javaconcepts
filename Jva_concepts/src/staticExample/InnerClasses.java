package staticExample;

import java.util.Arrays;

public class InnerClasses {
  static class Test{
    String name;
    public  Test(String name){
        this.name=name;
    }
}
// this wont work as Test class itself dependent on other class so it should have a object
    public static void main(String[] args) {
    Test a=new Test("rohit");
    Test b=new Test("jha");
        Arrays.toString(new int[]{1,2,3});
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
