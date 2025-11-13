package test_Nov10;

public class exceptionTest implements I1, I2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	public void m1() throws Exception{ - not compile 
//	You cannot declare new or broader checked exceptions than the method(s) you override.
//	}
	
	public void m1() {    //valid
		
	}
	
	

}


interface I1
{
   void m1() throws java.io.IOException;
}
interface I2
{
   void m1() throws java.sql.SQLException;
}

