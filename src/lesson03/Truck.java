package lesson03;

import lesson02.Climatable;
import lesson02.Engine;

public class Truck extends Car implements Climatable{

    public Truck(String manufacturer, String color, int produceYear) {
        super(manufacturer, color, produceYear);
    }

    public Truck(String manufacturer, String color, int produceYear, Engine engine) {
        super(manufacturer, color, produceYear, engine);
    }

    @Override
    protected String getName() {
        return "Truck";
    }
}
