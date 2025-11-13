package test_Nov10;

public class Test1 {
	public static void main(String[] args) {
		//iterating through the argument
		for(int i=0; i<args.length; i++) {
			System.out.print(i == 0 ? args[i] : " " + args[i]);
		}
	}
}
