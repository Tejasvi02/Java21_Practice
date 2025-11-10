package reflectionpractice_6thNov;

import java.lang.reflect.Method;

class Secret {
    private void displayMessage() {
        System.out.println("This is a private method!");
    }
}

public class InvokePrivateMethod {
    public static void main(String[] args) {
        try {
            // Create an instance of Secret
            Secret secret = new Secret();

            // Get the Class object
            Class<?> clazz = secret.getClass();

            // Get the private method "displayMessage"
            Method method = clazz.getDeclaredMethod("displayMessage");

            // Make the private method accessible
            method.setAccessible(true);

            // Invoke the method
            method.invoke(secret);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}