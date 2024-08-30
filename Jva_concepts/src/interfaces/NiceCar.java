package interfaces;

public class NiceCar {
    private Engine engine;
    private Media player=new Cdplayer();

    public NiceCar() {
 engine=new PowerEngine();

    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
public void startMusic(){
        player.start();
}
    public void stopmusic(){
        player.stop();
    }
    public void upgradeEngine(){//what engine i pass
        this.engine= new ElectricEngine();
    }
}
