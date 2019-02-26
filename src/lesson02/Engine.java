package lesson02;

public class Engine {
    private double volume;

    public Engine(double volume) {
        this.volume = volume;
    }

    public void startEngine() {
        System.out.println("engine is starting...");
    }

    public void stopEngine() {
        System.out.println("engine is stopping...");
    }
}
