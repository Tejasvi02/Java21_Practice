package comparatorComparable;

import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

// Comparator for sorting by name
class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

// Comparator for sorting by age (descending)
class AgeDescendingComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p2.getAge(), p1.getAge());
    }
}

public class ComparatorGenerics {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        Collections.sort(people, new NameComparator());
        System.out.println("Sorted by name: " + people);

        Collections.sort(people, new AgeDescendingComparator());
        System.out.println("Sorted by age (desc): " + people);
    }
}
