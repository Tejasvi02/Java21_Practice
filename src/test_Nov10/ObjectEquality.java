package test_Nov10;

public class ObjectEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Object();
		Object obj2 = obj;
		if(obj.equals(obj2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
