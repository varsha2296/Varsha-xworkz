public class States{	
	public static void main(String[] India)
	{
		System.out.println("JVM invokes main");
		
		stateName(India);
		
		System.out.println("exit main");
	}		
	public static void stateName(String[] names)
	{
		System.out.println("statesOfIndia: "+names);		
		
		int size=names.length;
		System.out.println("Total elements: "+size);
		
		String elementATIndex0=names[0];
		String elementATIndex4=names[4];
		
		System.out.println("Chief Minister @ index 0: "+elementATIndex0);
		System.out.println("Chief Minister @ index 4: "+elementATIndex4);
		System.out.println("Chief Minister @ index 8: "+names[8]);
	}	
}
