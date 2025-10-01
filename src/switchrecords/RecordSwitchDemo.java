package switchrecords;

public class RecordSwitchDemo {

    static void describePerson(Person person) {
        switch (person) {
            case Person(String name, int age) when age >= 18 ->
                System.out.println(name + " is an adult.");
            case Person(String name, int age) ->
                System.out.println(name + " is a minor (age " + age + ").");
            default ->
                System.out.println("Unknown person.");
        }
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 16);

        describePerson(p1);
        describePerson(p2);
    }
}
