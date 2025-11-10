package reflectionpractice_6thNov;

import java.lang.reflect.Field;

class Person {
    private String name = "John";
}

public class ModifyPrivateField {
    public static void main(String[] args) {
        try {
            // Create an instance of Person
            Person person = new Person();

            // Get the Class object
            Class<?> clazz = person.getClass();

            // Access the private field "name"
            Field nameField = clazz.getDeclaredField("name");

            // Make the private field accessible
            nameField.setAccessible(true);

            // Print original value
            System.out.println("Before modification: " + nameField.get(person));

            // Modify the value
            nameField.set(person, "Sarah");

            // Print modified value
            System.out.println("After modification: " + nameField.get(person));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
