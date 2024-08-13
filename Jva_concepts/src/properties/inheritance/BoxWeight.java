package properties.inheritance;

public class BoxWeight extends Box {
    double weight;
static void greeting(){
    System.out.println("im a greeting in boxweight class");
}
    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) {
        super(other);//it will check if boxweight object have acess to box type
        //yes it has as it is a parent class
        weight = other.weight;
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);//call the parent clas constructor
        //  System.out.println(super.weight);//now this will call superclass member  not boxweight m
        //member if we use this keyword
        this.weight = weight;
    }



}