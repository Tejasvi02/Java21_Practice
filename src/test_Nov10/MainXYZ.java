package test_Nov10;

class ClassX {

	ClassX(){
		System.out.println("Class X");
	}
}
class ClassY extends ClassX{
	
	ClassY(){
		System.out.println("ClassY");
	}
}

class ClassZ extends ClassY{
	ClassZ(){
		System.out.println("ClassZ");
	}
}

public class MainXYZ{
	public static void main(String[] args) {
		ClassY y = new ClassZ(); 
		//z constructor will call the class Y constructor and then call constructor of X
		//X will be created first, and the Y and then Z will be printed - because of super() which is default
	}
}