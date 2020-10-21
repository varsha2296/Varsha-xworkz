public class BooleanArray{
	public static void main(String args[])
	{
		System.out.println("invoked main method by JVM");
		arrayOfBoolean();
	}
	public static void arrayOfBoolean()
	{
		System.out.println("invoked arrayOfBoolean");
		
		boolean[] booleanValues={true,false};
		
		int sizeOfArray=booleanValues.length;
		System.out.println("Total elements: "+sizeOfArray);
		
		boolean elementAtIndex1=booleanValues[1];
		System.out.println("Element at index one: "+elementAtIndex1);
	}
}