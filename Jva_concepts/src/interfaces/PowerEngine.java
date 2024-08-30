package interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start(){
        System.out.println("power engine started");
    }
    @Override
    public void stop() {
        System.out.println("power engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("pwer engine vroom vroom");
    }

}
