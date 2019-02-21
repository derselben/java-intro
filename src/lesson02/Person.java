package lesson02;

public class Person {

    String firstName;
    String lastName;
    int age;
    private static int count = 0;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        count++;
    }

    void doSomething() {
        String end = "is doing something";

        System.out.println(firstName + " " + lastName + " " + end);
    }

    void doSomething(Person person) {
        String end = "is doing something";

        System.out.println(firstName + " " + lastName + " " + end + " with " + person.firstName + " " + person.lastName);
    }

    void compareAge(Person person) {

         int diff = this.age - person.age;
         String relation;

         if (diff>0) relation = "older then";
         else if (diff<0) relation = "younger then";
         else relation = "same age as";

        System.out.println(firstName + " is " + relation + " " + person.firstName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return lastName != null ? lastName.equals(person.lastName) : person.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    static {
        System.out.println("First time class loading");
    }

    {
        System.out.println(count + " class loading");
    }

}
