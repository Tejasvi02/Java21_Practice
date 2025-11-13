package test_Nov10;

public class Operations1 {

	public static void main(String[] args) {
		byte starting = 3;
		short firstValue = 5;
		int secondValue = 7;
		int functionValue = (int) (starting/2 + firstValue/2 + (int) firstValue/3 )
		                     + secondValue/2;
		System.out.println(functionValue);
		
		char c;
	      int i;
	      short s;
	      c = 'a';//1
	      i = c;  //2 valid
	      i++;    //3 valid
	      //c = i 
	      //above not valid because int is large than char so 
	      //cant be directly assigned without casting explicitly
	      c = (char)i;  //4 valid
	      c++;    //5 valid
	      //while working with short and char, they need to be casted both ways
	      s=(short)c;
	      c=(char)s;
	}
}
