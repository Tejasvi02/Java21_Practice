package reflections;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Class u1 = Class.forName("reflections.User"); //getting the class object it should handle class not found exception
		//we should give full name along with package name for using the forName()
		Class u2 = User.class;
		
		User u = new User();
		Class u3 = u.getClass();
		
		//above are the three ways to access a class
		System.out.println(u1.getName());
		System.out.println(u2.getName());
		System.out.println(u3.getName());
		
		
	}
}
