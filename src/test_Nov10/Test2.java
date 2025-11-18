package test_Nov10;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test = new Test2();
        test.printenum("John", "Doe"); 
        test.printenum("Jane", "Smith", Title.MS);
	}
	
	void printenum(String f, String l) {
		System.out.println(Title.MR.format(f, l));
	}
	//dynamic way:
	void printenum(String f, String l, Title title) {
	    System.out.println(title.format(f, l));
	}

}

enum Title
{
    MR("Mr. "), MRS("Mrs. "), MS("Ms. ");
    private String title;
    private Title(String s){
         title = s;
    }
    public String format(String first, String last){
         return title+" "+first+" "+last;
    }
}