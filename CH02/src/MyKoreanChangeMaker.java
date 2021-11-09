import java.util.Scanner;

public class MyKoreanChangeMaker {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a whole number from 1 to 10000.");
		int number = s.nextInt();
		if(number<1 || number>10000) {
			System.out.println("Your number is wrong !");
			System.exit(1);
		}
		System.out.printf("%d won in coins can be given as:\n", number);
		
		int n = number / 500;
		int remainder = number % 500;
		System.out.printf("%d 500 won\n", n);
		
		n = remainder / 100;
		remainder = remainder % 100;
		System.out.printf("%d 100 won\n", n);
		
		n = remainder / 10;
		remainder = remainder % 10;
		System.out.printf("%d 10 won\n", n);
		
		n = remainder / 5;
		remainder = remainder % 5;
		System.out.printf("%d 5 won\n", n);
		System.out.printf("%d 1 won", remainder);
		
	}

}
