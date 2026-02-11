package test_Nov10;

import java.util.*;

class Some { }

class TextBook extends Some { }

class BookList extends /*ArrayList<Some> - doesn't compile add else chnage add to have BOOK but can'd add "hello*/
   ArrayList{
    public int count = 0;

    public boolean add(Object o) {
        if (o instanceof Some b) {
            return super.add(b);
        } else {
            return count++ == -1;
        }
    }
}

public class BookMain {
    public static void main(String[] args) {
        BookList list = new BookList();

        list.add(new Some());
        list.add(new TextBook());
        list.add("hello"); 

        System.out.println(list.count);
    }
}
