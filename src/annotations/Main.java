package annotations;

public class Main implements PrintFile {

	public static void main(String[] args) {
		Main m = new Main();
	}
	
	@Override
	public void printFile(String fileName) {
		System.out.println("Print name: "+fileName);
	}
}
