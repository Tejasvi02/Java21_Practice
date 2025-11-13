package test_Nov10;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x =5;

		switch(x) {
		case 1,2 -> System.out.println("a");
		case 3,4 -> System.out.println("b"); 
		//without default it wont give compile or runtime error, just prints blank
		}
		
		boolean b1 = false;
		int i1 = 2;
		int i2 = 3;
		if(b1 = i1 == i2) { // == take higher precedence
			//id we do if(i1 ==i2 =b1) wont compile
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	

}
