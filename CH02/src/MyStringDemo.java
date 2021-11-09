import java.util.Scanner;

public class MyStringDemo {

	public static void main(String[] args) {
		
		String sentence = "Jesus Christ Is My Savior";
		int position, n;
		
		position = sentence.indexOf("Savior");
		System.out.println(sentence);
		//print numbers as long as the string length
		for(n=0; n<sentence.length(); n++) {
			System.out.print(n%10);
		}
		System.out.print("\n");
		
		System.out.println("The word \"Savior\" starts at index " + position);
		
		//First Change
		sentence = sentence.substring(0, position) + "friend";
		System.out.println("The changed string is:");
		System.out.println(sentence);
		
		//Second Change
		sentence = sentence.replaceAll("friend", "joy");
		sentence = sentence.toUpperCase();
		System.out.println("The changed string is:");
		System.out.println(sentence);
		
	}

}
