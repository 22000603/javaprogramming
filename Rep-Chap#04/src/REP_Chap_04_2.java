import java.util.Scanner;

public class REP_Chap_04_2 {

	public static void main(String[] args) {
		System.out.print("Please enter the number : ");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

		int row, col, blank, num;

		for (row = 1; row <= number; row++) {
			blank = number - row;
			num = 1;
			for (col = 1; col < number + row; col++) {
				if (col <= number) {
					if (col <= blank)
						System.out.print(" ");
					else {
						System.out.print(num);
						if (col != number)
							num++;
					}
				} else
					System.out.print(--num);
			}
			System.out.print("\n");
		}
	}

}
