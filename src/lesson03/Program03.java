package lesson03;

public class Program03 {
    public static void main(String[] args) {

        /** CLASS WORK */

        Truck truck = new Truck("Renault", "White", 2001, new Engine(5.6));
        PassengerCar passengerCar = new PassengerCar("Daewoo", "Silver",2005, new Engine(1.2));

        System.out.println(truck);
        System.out.println(passengerCar);

        truck.gas();
        truck.climateControl(27);
        passengerCar.gas();
        passengerCar.climateControl(21);
        passengerCar.stop();
        passengerCar.climateStop();
        truck.climateStop();
        truck.stop();

        /** HOME WORK */

    }
}
