import java.util.Scanner;

public class CH04_MyDrawing {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please input a number:");
		int number = s.nextInt();
		int i, j;
		int n = number;
		for(i=1; i<=number*2; i++) {
			if(i<=number) {
				for(j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
			else {
				for(j=1; j<=n; j++) {
					System.out.print("*");
				}
				n-=1;
				System.out.print("\n");
			}
		}

	}

}
