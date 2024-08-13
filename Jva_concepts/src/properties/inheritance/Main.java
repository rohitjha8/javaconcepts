package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1=new Box(2,3,4);
//        Box box2=new Box(box1);
//        System.out.println(box1.l +" "+box1.w+" "+ box1.h);

//        BoxWeight box3=new BoxWeight();
//        BoxWeight box4=new BoxWeight(1,2,3,-1);
//        System.out.println(box3.h+" "+ box3.weight);
//Box box5=new BoxWeight(2,3,4,8);
//        System.out.println(box5.w);
        //it cant access Boxweight.weight because type of reference variable
        //determines what members to be acees not type of object created
//        Box box2=new Box();
//        box2.greeting();
BoxPrice box=new BoxPrice(5,4,6);
Box box2=new BoxWeight();
box2.greeting();//static method cant be overriden but it can be inherited




    }
}
