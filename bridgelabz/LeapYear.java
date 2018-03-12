public class LeapYear {
 
	public static void main(String[] args) {
	
		//int year=args[0].toInteger();
		int year=Integer.parseInt(args[0]);
		if(year>=1582)
		{
			if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println(year + " is a leap year");
			else
			System.out.println(year + " is not a leap year");
		}
		else
		System.out.println("year must be greater than 1582");
	}
}
