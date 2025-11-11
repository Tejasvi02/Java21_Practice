package test_Nov10;

public class Test {
	static int x; //compiles like this, it will take default value of int which is 0
	int y; //default value 0
	Test(){
		int z; //default value 0
		x++;
		z=x;
		x++;
		y+=z;
	}
	static boolean result; //default value of boolean is false
	public static void main(String[] args) {
		//new Test(); //no compile error
		Test t = new Test();
		System.out.println(t.x);
		System.out.println(t.result);
		System.out.println(t.y);
		}
}
