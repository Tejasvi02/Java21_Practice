package test_Nov10;


interface Speed{
	//int speed =40; - this is final and cant be reassigned in class extending it
	//interface variables are implicitly public, final and static
}

class Vehicle2 implements Speed{
	public static int speed = 60;
}

class Car extends Vehicle2 implements Speed{
	public static void main(String[] args){
		speed = 80; 
		//speed is ambiguous here if given both in Speed and Vehicle2, so it doesn't know what to take so compile error
		System.out.println(speed);
	}
}