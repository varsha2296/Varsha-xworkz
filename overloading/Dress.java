public class Dress{	
	public static void hanger(String design)
	{
		System.out.println("invoked hanger");
		System.out.println("arg design: "+design);	
	}
	public static void hanger(String lace,String noOfButtons)
	{
		System.out.println("invoked hanger with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 lace: "+lace);
		System.out.println("arg2 noOfButtons: "+noOfButtons);
	}
	public static void hanger(String lace,int noOfButtons)
	{	
		System.out.println("invoked hanger with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 lace: "+lace);
		System.out.println("arg2 noOfButtons: "+noOfButtons);
	}
	public static void hanger(int noOfButtons,String lace)
	{
		System.out.println("invoked hanger with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 noOfButtons: "+noOfButtons);
		System.out.println("arg2 lace: "+lace);	
	}
}