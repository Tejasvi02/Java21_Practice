package test_Nov10;

public class Shape {
  public static void main(String[] args) {
	  Square s = new Square(5.5);
	  System.out.println(s.size);
	  s.setsize(7.5); //calling instance of same object s
	  System.out.println(s.size);
  }
}

class Square{
	public double size;
	Square(double size){
		this.size = size;
	}
	void setsize(double size) {
	  this.size = size;
	}
	
}
