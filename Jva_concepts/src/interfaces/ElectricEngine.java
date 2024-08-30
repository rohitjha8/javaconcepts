package interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("electric engine starting");
    }

    @Override
    public void stop() {
        System.out.println("electric engine stopping");
    }

    @Override
    public void acc() {
        System.out.println("electric engine trrr");
    }
}
