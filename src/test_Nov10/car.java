package test_Nov10;

public final class car extends Vehicle1 { //1

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Vehicle1{
	 final String getEngine(){ //this method can't be overrriden by any class extending it
		return "abcd";
	 }
}

//class car{ //2
//	Vehicle1 v;
////}
//
//final class car extends Vehicle1{ //3
//	
//}

//all three are valid only car can't be extended vehicle1 can