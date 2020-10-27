public class Age{
	public static void main(String[] life)
	{
		System.out.println("JVM invoked main from Age");
		
		byte age=22;
		String value=Grow.ageDefinition(age);
		System.out.println("return value from ageDefinition:"+value);
		
		System.out.println("EXIT :: main");
	}
}