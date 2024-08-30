package interfaces;

public class Main {
    public static void main(String[] args) {
//       Car car=new Car();

       // Engine car=new Car(); //this will not be accesible
//        System.out.println(car1.a);
//        car.start();
//        car.stop();
//        car.acc();
        //this wont be accesed as it will access only method of engine type car.brake();


        //see interface is perfomance critical
        //suppose ill create a mediatype reference and create an object
//this is stopping the car it should stop the mediacar so interfaces are not recomended in perfomanmce critical situation


//        Media mediacar=new Car();
//        mediacar.stop();
//
//        Cdplayer cd=new Cdplayer();
//        cd.start();



        NiceCar car=new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
        car.acc();

    }
}
