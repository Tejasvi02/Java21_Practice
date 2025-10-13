package customHashmap;

public class MyHashMap {
    private Integer[] keys;  // store integer keys
    private String[] values; // store string values
    private int capacity;
    private int size;

    public MyHashMap() {
        capacity = 5; // start with small capacity
        keys = new Integer[capacity];
        values = new String[capacity];
        size = 0;
    }

    // simple hash function
    private int hash(Integer key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public void put(Integer key, String value) {
        int index = hash(key);

        // linear probing for collision
        while (keys[index] != null && !keys[index].equals(key)) {
            index = (index + 1) % capacity;
        }

        // new key
        if (keys[index] == null) {
            size++;
        }

        keys[index] = key;
        values[index] = value;

        // resize if 75% full
        if (size > capacity * 0.75) {
            resize();
        }
    }

    public String get(Integer key) {
        int index = hash(key);

        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                return values[index];
            }
            index = (index + 1) % capacity;
        }

        return null; // not found
    }

    public void remove(Integer key) {
        int index = hash(key);

        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                keys[index] = null;
                values[index] = null;
                size--;
                return;
            }
            index = (index + 1) % capacity;
        }
    }

    private void resize() {
        System.out.println("Resizing from " + capacity + " to " + (capacity * 2));

        Integer[] oldKeys = keys;
        String[] oldValues = values;

        capacity = capacity * 2;
        keys = new Integer[capacity];
        values = new String[capacity];
        size = 0;

        // reinsert old data
        for (int i = 0; i < oldKeys.length; i++) {
            if (oldKeys[i] != null) {
                put(oldKeys[i], oldValues[i]);
            }
        }
    }

    public void printAll() {
        System.out.println("---- HashMap contents ----");
        for (int i = 0; i < capacity; i++) {
            if (keys[i] != null) {
                System.out.println(i + ": " + keys[i] + " = " + values[i]);
            }
        }
        System.out.println("--------------------------");
    }

    
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Grape");
        map.put(4, "Orange");
        map.put(5, "Mango");

        map.printAll();

        System.out.println("\nGet key 3: " + map.get(3));

        System.out.println("\nRemoving key 2...");
        map.remove(2);
        map.printAll();
    }
}
