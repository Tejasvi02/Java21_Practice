package test_Nov10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		System.out.println(p.getValue());
		System.out.println(p.sum(1, 34));
	}

}

class Parent{
	public short getValue() {
		return 1;
	}
	public long sum(int a, long b) {
		return a+b;
	}
}

class Child extends Parent{
	public short getValue() {
		return 2;
	}
	 
}