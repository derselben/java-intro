package lesson02;

public class Program02 {
    public static void main(String[] args) {

        /** CLASS WORK */

        Person Vasia = new Person("Vasia", "Petrov", 65);
        Person Petia = new Person("Petia", "Vasiliev", 46);
        Person Kolya = new Person("Kolya", "Ivanov", 46);
        Vasia.doSomething();
        Petia.doSomething(Vasia);
        Vasia.compareAge(Petia);
        Petia.compareAge(Vasia);
        Petia.compareAge(Kolya);

        System.out.println(Vasia);
        System.out.println(Petia.toString());

        System.out.println(Vasia.hashCode() + " " + Petia.hashCode() + " " + Vasia.equals(Petia));
        System.out.println("**************************************");

        /** HOME WORK */

        System.out.println(HomeWorkOnString.eachNth("Miracle", 2));
        System.out.println(HomeWorkOnString.eachNth("EightCha", 2));
        System.out.println(HomeWorkOnString.eachNth("EightCha", 3));
        System.out.println(HomeWorkOnString.eachNth("EightCha", 0));
        System.out.println(HomeWorkOnString.eachNth("EightCha", -2));
        System.out.println(HomeWorkOnString.eachNth("", 5));

    }
}
