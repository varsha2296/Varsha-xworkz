public class BooleanArray{
	public static void main(String args[])
	{
		System.out.println("invoked main method by JVM");
		arrayOfBoolean();
		System.out.println("exiting main method by JVM");
	}
	public static void arrayOfBoolean()
	{
		System.out.println("invoked arrayOfBoolean");
		
		boolean laptopHasAllApps=false;
		final boolean laptopShowsTime=true;
		boolean	cableHasAllChannels=true;
		boolean	chocolateIsRed=false;
		boolean leafyVegetablesAreGreen=true;
		
		boolean[] booleanValues={laptopHasAllApps,laptopShowsTime,
		cableHasAllChannels,chocolateIsRed,leafyVegetablesAreGreen};
		
		int sizeOfArray=booleanValues.length;
		System.out.println("Total elements: "+sizeOfArray);
		
		boolean elementAtIndex1=booleanValues[1];
		System.out.println("Element at index one: "+elementAtIndex1);
		
		boolean elementAtIndex2=booleanValues[2];
		System.out.println("Element at index two: "+elementAtIndex2);

		boolean elementAtIndex3=booleanValues[3];
		System.out.println("Element at index three: "+elementAtIndex3);
	}
}
