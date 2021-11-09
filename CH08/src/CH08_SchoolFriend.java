
public class CH08_SchoolFriend extends CH08_Friend{
	
	private String school;
	
	public CH08_SchoolFriend(){}
	
	public CH08_SchoolFriend(String school){
		this.school = school;
	}
	
	@Override
	public void whatfriend() {
		System.out.println("We are friends.");
		System.out.println("in "+school);
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

}
