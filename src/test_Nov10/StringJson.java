package test_Nov10;

public class StringJson {
	
	public static void main(String[] args) {
		String s = "{ \"employeeId\": \"Developer\", \"first_name\": \"Dave\" }";
		String json = """
				{
				  "employeeId": "Developer",
				  "first_name": "Dave"
				}
				""";
		StringBuilder stringBuilder = new StringBuilder(5);
		stringBuilder.setLength(10); //changes 5 to 10, doesn't add extra 10
		stringBuilder.append("Hello");
		//now length will be 15, since set length is 10 and it is appending Hello to it so totally 15 
		
		
		var array = new String[4];
		array[1] = "test1";
		array[2] = "test2";
		array[3] = "test3";
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		//the below wont run because boolean is false by default
		var string = "111";
		boolean barray[] = new boolean[1];
		if(barray[0]) {
			string = "333";
		}
		System.out.println(string);
		
		String s5 = "Hello World";
		String s6 = """
				Hello World""";
		String s7 = "Hello World";
		if(s5 == s7) {
			System.out.println("true");
		}
	}
}
