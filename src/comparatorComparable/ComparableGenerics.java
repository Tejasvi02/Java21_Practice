package comparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComparablePerson implements Comparable<ComparablePerson> {
    private String name;
    private int age;

    public ComparablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implement compareTo() to define natural order (by age)
    @Override
    public int compareTo(ComparablePerson other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparableGenerics {
    public static void main(String[] args) {
        List<ComparablePerson> people = new ArrayList<>();
        people.add(new ComparablePerson("Alice", 30));
        people.add(new ComparablePerson("Bob", 25));
        people.add(new ComparablePerson("Charlie", 35));

        Collections.sort(people); // uses compareTo
        System.out.println(people);
    }
}

