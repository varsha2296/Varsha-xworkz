public class Grow{
	public static String ageDefinition(byte age)
	{
		System.out.println("Invoked ageDefinition");

		System.out.println("Age:"+age);
		if(age<5){
			System.out.println("Age is lesser than 5");
			return "Kid";
		}
		if(age>5 && age<12){
			System.out.println("Age is greater than 5 and lesser than 12");
			return "Child";
		}
		if(age>12 && age<19){
			System.out.println("Age is greater than 12 and lesser than 19");
			return "Teen";
		}
		if(age>19 && age<60){
			System.out.println("Age is greater than 19 and lesser than 60");
			return "Adult";
		}
		if(age>60){
			System.out.println("Age is greater than 60");
			return "0ld";
		}
		return "Don'tno";
	}
}