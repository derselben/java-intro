package lesson03;

public abstract class Car {

    private String manufacturer;
    private String color;
    private int produceYear;
    private Engine engine;

    public Car(String manufacturer, String color, int produceYear) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.produceYear = produceYear;
    }

    public Car(String manufacturer, String color, int produceYear, Engine engine) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.produceYear = produceYear;
        this.engine = engine;
    }

    protected abstract String getName();

    public void gas() {
        engine.startEngine();
        System.out.println(getName() + " started to move");
    }

    public void stop() {
        System.out.println(getName() + " started to stop");
        engine.stopEngine();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + getName() + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", produceYear=" + produceYear +
                '}';
    }
}
