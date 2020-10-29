public class DressTester{
	public static void main(String[] prise)
	{
		System.out.println("JVM invoked main");	
		System.out.println("main method args length: "+prise.length);	
        
		String top="printed";
		Dress.hanger(top);

		Dress.hanger("frock",6);
		
		Dress.hanger("kurta","ten");

		System.out.println("EXIT :: main");	
	}
}