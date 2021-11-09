

public class CH06b_EnumTest {
	

	public static void main(String[] args) {
		
		CH06b_Suit s = CH06b_Suit.FRI;
		System.out.println("s.ordinal() = "+s.ordinal());
		System.out.println("s.compareTo(Suit.WED) = "+s.compareTo(CH06b_Suit.WED));
		System.out.println("s.toString() = "+s.toString());
		System.out.println("s.getColor() = "+s.getColor());
		
		for(CH06b_Suit t : CH06b_Suit.values()) {
			//System.out.println(t.toString() + "  " + t.getColor());
			System.out.println(t+ "  " + t.getColor());
		}

	}

}
