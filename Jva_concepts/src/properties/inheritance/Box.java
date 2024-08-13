package properties.inheritance;


public class Box {
    double  l;
    double h;
    double w;
    //double weight;
    static void greeting(){
        System.out.println("im in box class im greeting");
    }
    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box(double side) {

        this.l = side;
        this.h = side;

        this.w = side;

    }


     Box(double l,double h,double w) {
         System.out.println("Box class constructor");
         this.h = h;
         this.w = w;
         this.l = l;
     }
        Box(Box old){
        this.h=old.h;
        this.w=old.w;
        this.l=old.l;
}
public void information(){
    System.out.println("Running the box");
}
}