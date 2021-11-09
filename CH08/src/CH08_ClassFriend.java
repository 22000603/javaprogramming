
public class CH08_ClassFriend extends CH08_SchoolFriend {
	
	private String school;
	private String cla;
	
	public CH08_ClassFriend(String school, String cla){
		this.school = school;
		this.cla = cla;
	}
	
	@Override
	public void whatfriend() {
		System.out.println("We are friends.");
		System.out.println("in "+school);
		System.out.println("in "+cla);
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCla() {
		return cla;
	}

	public void setCla(String class1) {
		
		cla = class1;
	}
}
