package lesson02;

public class Program {
    public static void main(String[] args) {
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

        //System.out.println(Person.count + " person object(s) were created");
    }
}
