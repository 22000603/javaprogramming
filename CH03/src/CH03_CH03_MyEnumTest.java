

public class CH03_CH03_MyEnumTest {
	
	enum Weeks {MON, TUE, WED, THR, FRI, SAT, SUN}

	public static void main(String[] args) {
		
		Weeks[] arr = Weeks.values();
		for(Weeks week : arr)
		{
			switch (week)
			{
			case MON:
				System.out.println("Monday!");
				break;
			case TUE:
				System.out.println("Tuesday!");
				break;
			case WED: 
				System.out.println("Wednesday!");
				break;
			case THR:
				System.out.println("Thursday!");
				break;
			case FRI:
				System.out.println("Friday!");
				break;
			case SAT:
				System.out.println("Saturday!");
				break;
			case SUN:
				System.out.println("Sunday!");
				break;
			default:
				break;
			}
		}
	}

}

