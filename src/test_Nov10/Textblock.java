package test_Nov10;

public class Textblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = """
				Str Str""";
				System.out.println(str.charAt(4));
		
		//String string = """Str Str"""; - doesn't compile
				
				String s =
				"""
				   Str
				    Str
				""";
				System.out.println(s.charAt(4));
				

	}

}
