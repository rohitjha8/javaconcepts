package interfaces;

public class Cdplayer implements Media
{
    @Override
    public void start() {
        System.out.println("stop the media player");
    }

    @Override
    public void stop() {
        System.out.println("start the media player");
    }
}
