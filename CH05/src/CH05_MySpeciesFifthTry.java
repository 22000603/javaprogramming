import java.util.Scanner;

public class CH05_MySpeciesFifthTry {

	private String name;
	private int population;
	private double growthRate;

	public static void main(String[] args) {

		CH05_MySpeciesFifthTry speciesOfTheMonth = new CH05_MySpeciesFifthTry();

		System.out.println("Enter number of years to project:");
		Scanner keyboard = new Scanner(System.in);
		int numberOfYears = keyboard.nextInt();

		System.out.println("Enter data on the Species of the Month:");
		speciesOfTheMonth.readInput();
		speciesOfTheMonth.writeOutput();
		int futurePopulation = speciesOfTheMonth.predictPopulation(numberOfYears);
		System.out.println("In " + numberOfYears + " years the population will be " + futurePopulation);

		speciesOfTheMonth.setSpecies("Klingon ox", 10, 15);
		//speciesOfTheMonth.setName("Klingon ox");
		//speciesOfTheMonth.setPopulation(10);
		//4speciesOfTheMonth.setGrowthRate(15.0);

		System.out.println("The new Species of the Month:");
		speciesOfTheMonth.writeOutput();

		futurePopulation = speciesOfTheMonth.predictPopulation(numberOfYears);
		System.out.println("In " + numberOfYears + " years the population will be " + futurePopulation);

	}

	public void readInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("What is the species's name?");
		name = s.nextLine();
		
		System.out.println("What is the population of the species?");
		population = s.nextInt();
		
		System.out.println("Enter growth rate (% increase per year):");
		growthRate = s.nextDouble();	
	}

	public void writeOutput() {
		System.out.println("Name = "+name);
		System.out.println("Population = "+population);
		System.out.println("Growth rate = "+growthRate+"%");
	}

	public int predictPopulation(int years) {
		int result = 0;
		double populationAmount = population;
		int count = years;
		while((count>0)&&(populationAmount>0)) {
			populationAmount = populationAmount+(growthRate/100)*populationAmount;
			count--;
		}
		if(populationAmount>0)
			result = (int) populationAmount;
		
		return result;
	}
	public void setSpecies(String name, int population, double growthRate) {
		this.name = name;
		if(population >= 0)
			this.population = population;
		else {
			System.out.println("ERROR: using a negative population. ");
			System.exit(0);
		}
		this.growthRate = growthRate;
	}
	
	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public double getGrowthRate() {
		return growthRate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void setGrowthRate(double growthRate) {
		this.growthRate = growthRate;
	}

}
