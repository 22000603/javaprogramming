
public class CH06a_Neo {
	
	private static int howmany = 0;
	private String emoticon;

	public static void main(String[] args) {
		CH06a_Neo emoticon1 = new CH06a_Neo("Smile");
		CH06a_Neo emoticon2 = new CH06a_Neo("Angry");
		CH06a_Neo emoticon3 = new CH06a_Neo("Fighting");
		CH06a_Neo emoticon4 = new CH06a_Neo("Sad");
		CH06a_Neo emoticon5 = new CH06a_Neo("Happy");
		CH06a_Neo emoticon6 = new CH06a_Neo("Sleepy");
		
		System.out.println("The number of Emoticons: "+ CH06a_Neo.gethowmany());
		emoticon1.emoticonStyle();
		emoticon2.emoticonStyle();
		emoticon3.emoticonStyle();
		emoticon4.emoticonStyle();
		emoticon5.emoticonStyle();
		emoticon6.emoticonStyle();
		
	}
	public CH06a_Neo(String emoticon) {
		this.emoticon = emoticon;
		howmany++;
	}
	
	public static int gethowmany() {
		return howmany;
	}
	public void emoticonStyle() {
		System.out.println("Neo is " + emoticon + ".");
	}

}
