package lesson03;

import lesson02.Climatable;
import lesson02.Engine;
import lesson02.Person;

public class PassengerCar extends Car implements Climatable {

    private Person[] persons;

    public PassengerCar(String manufacturer, String color, int produceYear) {
        super(manufacturer, color, produceYear);
    }

    public PassengerCar(String manufacturer, String color, int produceYear, Engine engine) {
        super(manufacturer, color, produceYear, engine);
    }

    @Override
    public void climateControl(int temp) {
        System.out.println("Climate control tries to make temp: " + temp);
    }

    @Override
    protected String getName() {
        return "Passenger Car";
    }

}
