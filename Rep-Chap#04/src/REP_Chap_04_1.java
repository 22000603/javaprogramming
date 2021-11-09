import java.util.Scanner;

public class REP_Chap_04 {

	public static void main(String[] args) {
		System.out.print("Please enter the number : ");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

		int row, col, blank, num;

		for (row = 1; row <= number; row++) {
			blank = number - row;
			for (col = 1; col <= blank; col++)
				System.out.print(" ");
			for (num = 1; num <= row; num++)
				System.out.print(num);
			for (num = row - 1; num >= 1; num--)
				System.out.print(num);

			System.out.print("\n");
		}
	}
}
