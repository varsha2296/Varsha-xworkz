public class CurtainsTester{
	public static void main(String[] quality)
	{
		System.out.println("JVM invoked main");	
		System.out.println("main method args length: "+quality.length);	
        
		String door="round";
		Curtains.rings(door);

		Curtains.rings(door,6);
		
		Curtains.rings(door,"six");

		System.out.println("EXIT :: main");	
	}
}