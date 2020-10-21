public class CharArray{
	public static void main(String args[])
	{
		System.out.println("invoked main method by JVM");
		arrayOfLetters();
	}
	public static void arrayOfLetters()
	{
		System.out.println("invoked arrayOfLetters");
		
		char[] letters={'A','B','C','D','E','F','G','H','I','J'};
		
		int sizeOfArray=letters.length;
		System.out.println("Total elements: "+sizeOfArray);
		
		char elementAtIndex6=letters[6];
		System.out.println("Element at index six: "+elementAtIndex6);
	}
}