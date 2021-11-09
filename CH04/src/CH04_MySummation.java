import java.util.Scanner;

public class CH04_MySummation {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please input a number:");
		int number = s.nextInt();
		System.out.printf("The summation from 1 to %d is\n", number);
		int sum  = 0;
		for(int i=1; i<=number; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
