package Accesors;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        A obj = new A(23, "rohit");
//    ArrayList<Integer> arr=new ArrayList<>();
        //obj.num;//will not work because it is private member and you cant access private data members
        obj.getNum();
        ;//

    }
}
