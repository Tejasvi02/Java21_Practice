package customArrayList;

public class MyArrayList {
    private int[] data;   // internal array to store elements
    private int size;     // number of elements actually stored

    // default initial capacity
    private static final int INITIAL_CAPACITY = 5;

    // constructor
    public MyArrayList() {
        data = new int[INITIAL_CAPACITY];
        size = 0;
    }

    // add an element to the list
    public void add(int value) {
        // check if array is full
        if (size == data.length) {
            resize();
        }
        data[size++] = value;
    }

    // get an element by index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    // return current number of elements
    public int size() {
        return size;
    }

    // resize method — doubles the capacity
    private void resize() {
        int newCapacity = data.length * 2;
        int[] newData = new int[newCapacity];

        // copy old data into new array
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
        System.out.println("Resized array to new capacity: " + newCapacity);
    }

    // print elements
    public void printList() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("]");
    }

    // demo
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        for (int i = 1; i <= 12; i++) {
            list.add(i);
            System.out.println("Added: " + i + " | Size: " + list.size());
            list.printList();
        }
    }
}
