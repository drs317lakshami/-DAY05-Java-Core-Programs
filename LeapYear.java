package bridgelabz.day05.com;

public class LeapYear {
	public static void main(String[] args) {
		LeapYear year = new LeapYear(2000);
		
	}
	
	public LeapYear(int year) {
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println(year + " is a leap year");
		else 
			System.out.println(year + " is not a leap year");
			
	}
}