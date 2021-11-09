import java.util.Scanner;

public class MyFtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a temperature (integer number, no fractional part) in degrees Fahrenheit.");
		int degreesF = s.nextInt();
		double degreesC = 5 * ( (float) degreesF - 32) / 9;
		System.out.printf("%d degrees Fahrenheit = %f degrees Celsius.\n", degreesF, degreesC);
	
	}

}
