
import java.util.Scanner;


public class Movie {

	
	private String movieName;
	private String MPAA;
	private int[] number;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Movie mammamia = new Movie("mammamia", "PG-13");
		Movie theIntern = new Movie("theIntern", "PG");
		Movie HarryPotter = new Movie("HarryPotter", "G");
		
		mammamia.setRating(1, 2);
		mammamia.setRating(2, 3);
		mammamia.setRating(3, 2);
		mammamia.setRating(4, 8);
		mammamia.setRating(5, 10);
		
		theIntern.setRating(1, 0);
		theIntern.setRating(2, 1);
		theIntern.setRating(3, 2);
		theIntern.setRating(4, 7);
		theIntern.setRating(5, 12);
		
		HarryPotter.setRating(1, 3);
		HarryPotter.setRating(2, 3);
		HarryPotter.setRating(3, 5);
		HarryPotter.setRating(4, 13);
		HarryPotter.setRating(5, 14);
		
		System.out.println("Movie List : ");
		System.out.printf(mammamia.toString()+ "GPA = %.2f ]\n", mammamia.getAverage());
		System.out.printf(theIntern.toString()+ "GPA = %.2f ]\n", theIntern.getAverage());
		System.out.printf(HarryPotter.toString()+ "GPA = %.2f ]\n", HarryPotter.getAverage());
		
		int count = 0;
		while(true) {
		System.out.print("\nDo you want to give rating? (y/n)");
		String answer = s.next();
		if(answer.equals("y")){
			System.out.println("What kind of movie do you want to give evaluation?");
			String m = s.next();
			int e = s.nextInt();
			if(m.equals("mammamia")) mammamia.addRating(e);
			else if(m.equals("theIntern")) theIntern.addRating(e);
			else if(m.equals("HarryPotter")) HarryPotter.addRating(e);
			else 
				System.out.println("There is not that movie.");
			System.out.printf("Add %d to [%s]\n", e, m);
			count++;
		}
		else if(answer.equals("n")) {
			if(count >= 5) break;
			else System.out.println("You have to add rating at least 5 !");
		}
		else
			System.out.println("Your answer should be y/n.");
		}
		
		System.out.println("\nUpdated Movie List : ");
		System.out.printf(mammamia.toString()+ "GPA = %.2f ]\n", mammamia.getAverage());
		System.out.printf(theIntern.toString()+ "GPA = %.2f ]\n", theIntern.getAverage());
		System.out.printf(HarryPotter.toString()+ "GPA = %.2f ]\n", HarryPotter.getAverage());
		}
	

	
	public Movie(String movieName, String MPAA) {
		this.movieName = movieName;
		this.MPAA = MPAA;
		number = new int[5];
		for(int i=0; i<5; i++) {
			number[i] = 0;
		}
	}
	
	public void addRating(int number) {
		this.number[number-1] += 1;
	}
	
	public Double getAverage() {
		double average;
		int sumGrade = 0;
		int sumPeople = 0;
		
		for(int i=0; i<5; i++) {
			sumGrade += (i+1)*number[i];
			sumPeople += number[i];
		}
		
		average = (double) sumGrade / sumPeople;
		
		return average;
	}
	
	public void setRating(int number, int rating) {
		this.number[number-1] = rating;
	}
	
	
	@Override
	public String toString() {
		return "[ Name = " + movieName + ", MPAA = " + MPAA + ", ";
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMPAA() {
		return MPAA;
	}
	public void setMPAA(String MPAA) {
		this.MPAA = MPAA;
	}
	public int[] getNumber() {
		return number;
	}
	public void setNumber(int[] number) {
		this.number = number;
	}
}
