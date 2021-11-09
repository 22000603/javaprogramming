
public class CH08_Friend {

	public static void main(String[] args) {
		CH08_Friend [] fr = new CH08_Friend[3];
		
		fr[0] = new CH08_Friend();
		fr[1] = new CH08_SchoolFriend("Handong Global University");
		fr[2] = new CH08_ClassFriend("Handong Global University","Java Programming");
		
		for(int i=0; i<fr.length; i++ ) {
			fr[i].whatfriend();
			System.out.println(" ");
		}
	}
	
	public CH08_Friend(){};
	public void whatfriend() {
		System.out.println("We are friends.");
	}

}
