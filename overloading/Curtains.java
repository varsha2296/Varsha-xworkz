public class Curtains{	
	public static void rings(String shape)
	{
		System.out.println("invoked rings");
		System.out.println("arg shape: "+shape);	
	}
	public static void rings(String shape,String noOfRings)
	{
		System.out.println("invoked rings with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 shape: "+shape);
		System.out.println("arg2 noOfRings: "+noOfRings);
	}
	public static void rings(String shape,int noOfRings)
	{	
		System.out.println("invoked rings with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 shape: "+shape);
		System.out.println("arg2 noOfRings: "+noOfRings);
	}
	public static void rings(int noOfRings,String shape)
	{
		System.out.println("invoked rings with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 noOfRings: "+noOfRings);
		System.out.println("arg2 shape: "+shape);	
	}
}