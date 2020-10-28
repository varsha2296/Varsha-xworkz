public class AgeCalculatorTester{
	public static void main(String[] args)
	{
		System.out.println("JVM invoked main");
		
		String ageInString=args[0];
		
		byte age=Byte.parseByte(ageInString);
		String value=AgeCalculator.ageDefinition(age);
		System.out.println("return value from ageDefinition:"+value);
		
		System.out.println("EXIT :: main");
	}
}