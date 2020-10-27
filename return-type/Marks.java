public class Marks{
	public static void main(String[] grade)
	{
		System.out.println("JVM invoked main from Marks");
		
		double percentage=22;
		String mk=MarksCard.report(percentage);
		System.out.println("return value from percentage:"+mk);
		
		System.out.println("EXIT :: main");
	}	
}