import java.util.Scanner;

public class CH05_MyCalculator2 {

	private int a;
	private int b;

	public static void main(String[] args) {
		CH05_MyCalculator2 myCal2 = new CH05_MyCalculator2();
		myCal2.getinput();
		myCal2.printresult();

	}

	public void getinput() {
		Scanner s = new Scanner(System.in);
		printmenu();
		System.out.print("Type 1st Num: ");
		a = s.nextInt();
		System.out.print("Type 2nd Num: ");
		b = s.nextInt();
	}

	public void printresult() {
		System.out.println("a + b = " + addition());
		System.out.println("a - b = " + subtraction());
		System.out.println("a * b = " + multiplication());
		System.out.println("a / b = " + division());
	}
	
	private void printmenu() {
		System.out.println("*** CH05_MyCalculator2 ***");
	}
	private double addition() {
		return a+b;
	}
	private double subtraction() {
		return a-b;
	}
	private double multiplication() {
		return a*b;
	}
	private double division() {
		return a/b;
	}
	

}
