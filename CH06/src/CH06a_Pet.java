
public class CH06a_Pet {
	
	private String name = null;
	private int age;
	private double weight;
	
	public static void main(String[] args) {
		CH06a_Pet p;
		
		System.out.println("\nExample 1 - No parameter");
		p = new CH06a_Pet();	p.writeOutput();
		
		System.out.println("\nExample 2-1 - Full parameter");
		p = new CH06a_Pet("cat",5,2.2);	p.writeOutput();
		
		System.out.println("\nExample 2-2 - Negative Age");
		p = new CH06a_Pet("cat",-5,2.2);	p.writeOutput();
		
		System.out.println("\nExample 2-3 - Negative Weight");
		p = new CH06a_Pet("cat",5,-2.2);	p.writeOutput();
		
		System.out.println("\nExample 3 - Name parameter");
		p = new CH06a_Pet("cat");	p.writeOutput();
		
		System.out.println("\nExample 4-1 - Age parameter");
		p = new CH06a_Pet(5);	p.writeOutput();
		
		System.out.println("\nExample 4-2 - Negative Age");
		p = new CH06a_Pet(-5);	p.writeOutput();
		
		System.out.println("\nExample 5-1 - Weight parameter");
		p = new CH06a_Pet(2.2);	p.writeOutput();
		
		System.out.println("\nExample 5-2 - Negative Weight");
		p = new CH06a_Pet(-2.2);	p.writeOutput();

	}
	
	public CH06a_Pet(String name , int age , double weight) {
		this.name = name;
		if((age<0) || (weight<0)){
			System.out.println("Error: Negative age or weight.");
		}
		else {
			this.age = age;
			this.weight = weight;
		}
		
	}
	public CH06a_Pet(String name) {
		this.name = name;
	}
	public CH06a_Pet(int age) {
		if(age<0) System.out.println("Error: Negative age.");
		else this.age = age;
		
	}
	public CH06a_Pet(double weight) {	
		if(weight<0) System.out.println("Error: Negative weight.");
		else this.weight = weight;
	}
	public CH06a_Pet() {
		//name = null;
		age = 0;
		weight = 0.0;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public void writeOutput() {
		if(name==null) System.out.println("Name: No name yet.");
		else System.out.println("Name: " + name);
		System.out.println("Age: " + age + " years");
		System.out.println("Weight: " + weight + " pounds");
	}

}
