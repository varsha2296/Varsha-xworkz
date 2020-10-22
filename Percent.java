public class Percent{
	public static void main(String args[])
	{
		System.out.println("invoked main method by JVM");
		arrayOfPercentage();
		System.out.println("exiting main method by JVM");
	}
	public static void arrayOfPercentage()
	{
		System.out.println("invoked arrayOfPercentage");
		
		float sslcPercent=81.28f;
		float pucPercent=79.17f;
		float degreePercent=63.00f;
		
		float[] percentage={sslcPercent,pucPercent,degreePercent};
		
		int sizeOfArray=percentage.length;
		System.out.println("Total elements: "+sizeOfArray);
		
		float elementAtIndex0=percentage[0];
		System.out.println("Element at index zero: "+elementAtIndex0);
		
		float elementAtIndex1=percentage[1];
		System.out.println("Element at index one: "+elementAtIndex1);
		
		float elementAtIndex2=percentage[2];
		System.out.println("Element at index two: "+elementAtIndex2);
	}
}
