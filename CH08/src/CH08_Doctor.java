
public class CH08_Doctor extends CH08_Person{
	
	private String specialty;
	private double officeFee;
	
	public CH08_Doctor(){
		officeFee = 150.0;
		specialty = "None given.";
	}
	public CH08_Doctor(String name) {
		super.setName(name);
		officeFee = 150.0;
		specialty = "None given.";
	}
	public CH08_Doctor(String name, double fee) {
		super.setName(name);
		officeFee = fee;
		specialty = "None given.";
	}
	public CH08_Doctor(String name, String spe) {
		super.setName(name);
		specialty = spe;
		officeFee = 150.0;
	}
	public CH08_Doctor(String name, double fee, String spe) {
		super.setName(name);
		officeFee = fee;
		specialty = spe;
	}
	@Override
	public void writeOutput( )
    {
        System.out.println("Name: " + super.getName());
        System.out.println("Office Fee: $" + officeFee);
        System.out.println("Specialty: " + specialty);
    }
	
	public void writeName() {
		System.out.println("Name: " + super.getName());
		
	}
	public void writeOfficeFee() {
		System.out.println("Office Fee: $" + officeFee);
		
	}
	public void writeSpecialty() {
		System.out.println("Specialty: " + specialty);
		
	}
	public void set(String name, double fee, String spe) {
		super.setName(name);
		officeFee = fee;
		specialty = spe;
	}
	public void setOfficeFee(double fee) {
		officeFee = fee;
	}
	public double getOfficeFee() {
		return officeFee;
	}
	public void setSpecialty(String spe) {
		specialty = spe;
	}
	public String getSpecialty() {
		return specialty;
	}
	public boolean equals(CH08_Doctor doctor) {
		if((super.getName().equals(doctor.getName())
				&& (officeFee == doctor.getOfficeFee())
				&& (specialty == doctor.getSpecialty())))
				return true;
		else return false;
	}

}
