package lesson02;

public interface Climatable {

    default void climateControl(int temp) {
        System.out.println("AC works temp: " + temp);
    }

    default void climateStop() {
        System.out.println("Climate control system is turned off");
    }
}
