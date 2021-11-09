import java.util.Scanner;

import javax.swing.JOptionPane;

public class MyKoreanChangeMakerWinddow {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String num = JOptionPane.showInputDialog("\"Enter a whole number from 1 to 10000.\"");
		int number = Integer.parseInt(num);
		if(number<1 || number>10000) {
			JOptionPane.showMessageDialog(null, "Your number is wrong !");
			System.exit(1);
		}
		int n1 = number / 500;
		int remainder1 = number % 500;
		
		int n2 = remainder1 / 100;
		int remainder2 = remainder1 % 100;

		int n3 = remainder2 / 10;
		int remainder3 = remainder2 % 10;
		
		int n4 = remainder3 / 5;
		int remainder4 = remainder3 % 5;
		
		JOptionPane.showMessageDialog(null, number+" won in coins can be given as:\n"+
		n1+ " 500 won\n" +n2+" 100 won\n" +n3+" 10 won\n" +n4+" 5 won\n" + remainder4 + " 1 won\n");
		
		System.exit(0);
		
	}

}
