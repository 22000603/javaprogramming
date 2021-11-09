import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("This program will test whatever text" 
				+ "\nyou enter to see if is a palindrome"
				+ "\n(reads the same backwards and forwards).\n ");

		while (true) {

			
			System.out.println("Enter text (just leters and blanks, please.)");
			String leters = s.nextLine();
			
			if(leters.charAt(leters.length()-1)=='.') 
				leters = leters.substring(0, leters.length()-1);

			char[] a = leters.toCharArray();

			if (!(Palindrome.check(a)) || a.length > 80 || a.length < 1) {
				System.out.println(
						"Text should contain only letters " 
				+ "and blacks and be at most 80 characters long.");
			} else {
				if (Palindrome.isPalindrome(a, 0))
					System.out.println("YES, the phrase is a palindrome!");
				else
					System.out.println("NO, the phrase is NOT a palindrome.");
			}

			System.out.println("Do you want to keep test? (y/n)");
			String ans = s.next();
			if (ans.equals("n")) {
				System.out.println("Test closed.");
				break;
			}
			s.nextLine();
		}
	}

	public static boolean isPalindrome(char[] a, int used) {

		if (a[used] == a[a.length - 1 - used]) {

			if (used == (a.length / 2))
				return true;
			else
				return isPalindrome(a, ++used);
		} else
			return false;

	}

	public static boolean check(char[] a) {
		for (int i = 0; i < a.length; i++) {
			if (Character.isLetter(a[i]) || a[i] == ' ') {
				continue;
			}
			return false;
		}
		return true;
	}
}
