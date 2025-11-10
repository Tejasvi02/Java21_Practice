package test_Nov10;

class A {
	int x=200;
	public static void method1() {
		System.out.println("class A static method");
	}

}

class B extends A{
	int x = 300;
	public static void method1() {
		System.out.println("class B static method");
	}
	
//	public void method1() { -----------------//compile error
//		System.out.println("Non static method");
//	}
}

class MainAB{
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.x);
	}
}