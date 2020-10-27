public class MarksCard{
	public static String report(double percentage)
	{
	System.out.println("Invoked report");

		System.out.println("percentage:"+percentage);
		if(percentage>=80 && percentage<100){
			System.out.println("percentage is greater than 80 and lesser than 100");
			return "Distinction";
		}
		if(percentage>=70 && percentage<80){
			System.out.println("percentage is greater than 70 and lesser than 80");
			return "1st Class";
		}
		if(percentage>=60 && percentage<70){
			System.out.println("percentage is greater than 60 and lesser than 70");
			return "2nd Class";
		}
		if(percentage>=50 && percentage<=35){
			System.out.println("percentage is greater than 19 and lesser than 60");
			return "Pass";
		}
		if(percentage<35){
			System.out.println("percentage is lesser than 35");
			return "Fail";
		}
		return "OutOfRange";
	}
}