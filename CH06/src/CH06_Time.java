
public class CH06_Time {

	public static void main(String[] args) {
		
		CH06_Time time1 = new CH06_Time();
		System.out.printf("Should be 0, 0: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		time1.setTime(12,12);
		System.out.printf("Should be 12, 12: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		time1.setTime(-1,12);
		System.out.printf("Should be 12, 12: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		time1.setTime(12,-1);
		System.out.printf("Should be 12, 12: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		time1.setTime(24,12);
		System.out.printf("Should be 12, 12: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		time1.setTime(12,60);
		System.out.printf("Should be 12, 12: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		time1.setTime(8,16,true);
		System.out.printf("Should be 8, 16: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		time1.setTime(8,16,false);
		System.out.printf("Should be 20, 16: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		time1.setTime(0,17,true);
		System.out.printf("Should be 20, 16: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		time1.setTime(12,17,true);
		System.out.printf("Should be 0, 17: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		time1.setTime(0,17,false);
		System.out.printf("Should be 0, 17: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		time1.setTime(12,17,false);
		System.out.printf("Should be 12, 17: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		time1.setTime(12,19,true);
		System.out.printf("Should be 0, 19: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		time1.setTime(12,19,false);
		System.out.printf("Should be 12, 19: hour: %d minute: %d\n\n", time1.getHour(), time1.getMinute());
		
		System.out.println("\nTesting the constructors");
		CH06_Time time2 = new CH06_Time(12,19);
		System.out.println("should be 12:19pm: "+time2.getTime24()+" and "+time2.getTime12()+"\n");
		CH06_Time time3 = new CH06_Time(12,19,false);
		System.out.println("should be 12:19pm: "+time3.getTime24()+" and "+time3.getTime12()+"\n");
		CH06_Time time4 = new CH06_Time(0,19);
		System.out.println("should be 12:19am: "+time4.getTime24()+" and "+time4.getTime12()+"\n");
		CH06_Time time5 = new CH06_Time(12,19,true);
		System.out.println("should be 12:19am: "+time5.getTime24()+" and "+time5.getTime12()+"\n");
		CH06_Time time6 = new CH06_Time(3,19);
		System.out.println("should be 3:19am: "+time6.getTime24()+" and "+time6.getTime12()+"\n");
		CH06_Time time7 = new CH06_Time(3,19,true);
		System.out.println("should be 3:19am: "+time7.getTime24()+" and "+time7.getTime12()+"\n");
		CH06_Time time8 = new CH06_Time(15,19);
		System.out.println("should be 3:19pm: "+time8.getTime24()+" and "+time8.getTime12()+"\n");
		CH06_Time time9 = new CH06_Time(3,19,false);
		System.out.println("should be 3:19pm: "+time9.getTime24()+" and "+time9.getTime12()+"\n");

	}
	
	private int hour;
	private int minute; 
	
	public CH06_Time(){
		hour = 0;
		minute = 0;
		System.out.printf("Create a default time\n      ");
		
	}
	
	public CH06_Time(int hour, int minute){
		System.out.printf("Create the time %d, %d\n      ", hour, minute);
		if(isValid(hour, minute)) {
			this.hour = hour;
			this.minute = minute;
		}
	}
	
	public CH06_Time(int hour, int minute, boolean isAM){
		System.out.printf("Create the time %d, %d with the other constructor\n      ", hour, minute);
		if(isValid(hour, minute) && 1 <= hour && hour <= 12) {
			if(isAM) {
				if(hour==12) this.hour = 0;
				else	this.hour = hour;
				this.minute = minute;
				}
			else {
				if(hour==12) this.hour = 12;
				else	this.hour = hour + 12;
				this.minute = minute;
				}
			}
	}
	
	private boolean isValid(int hour, int minute) {
		if(0 <= hour && hour < 24 && 0<= minute && minute < 60)
			return true;
		else return false;
	}
	
	public boolean isAM(int hour) {
		if(0 <= hour && hour < 12)
			return true;
		else return false;
	}
	//save time 24 hours
	public void setTime(int hour, int minute) {
		if(isValid(hour, minute)) {
			this.hour = hour;
			this.minute = minute;
			System.out.printf("Set the time to %d, %d\n      ", hour, minute);
		}
		else
			System.out.printf("Trying to set time to %d, %d\n      ", hour, minute);
	}
	
	//change time to save time 24 hours
	public void setTime(int hour, int minute, boolean isAM) {
		if(isValid(hour, minute) && 1 <= hour && hour <= 12) {
			
			if(isAM) {
				System.out.printf("Set the time to %d, %d am\n      ", hour, minute);
				if(hour==12) this.hour = 0;
				else this.hour = hour;
				this.minute = minute;			
			}
			else {
				System.out.printf("Set the time to %d, %d pm\n      ", hour, minute);
				if(hour==12) this.hour = 12;
				else this.hour = hour+12;				
				this.minute = minute;
			}
			}
		else {
			if(isAM)
				System.out.printf("Trying to set time to %d, %d am\n      ", hour, minute);
			else
				System.out.printf("Trying to set time to %d, %d pm\n      ", hour, minute);
		}
		//System.out.printf("Should be %d, %d: hour: %d minute: %d\n", this.hour, this.minute);
	}
	
	public String getTime24() {
		
		return String.format("%02d%02d", hour, minute);
	}
	public String getTime12() {
		
		if(isAM(hour)) {
			if(hour==0)
				return String.format("%d:%dAM", 12, minute);
			else
				return String.format("%d:%dAM", hour, minute);
		}
		else {
			if(hour==12)
				return String.format("%d:%dPM", hour, minute);
			else
				return String.format("%d:%dPM", hour-12, minute);
		}
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
}
