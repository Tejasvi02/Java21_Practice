package test_Nov10;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    static Path p1 = Paths.get("c:\\main\\project\\Starter.java");
    
    public static String getData(){
        String data = p1.getName(0).toString();
        //p1.getName(0) returns the first name element, which is "main"
        return data;
    }
    
    public static void main(String[] args) {
        System.out.println(getData());
    }
}