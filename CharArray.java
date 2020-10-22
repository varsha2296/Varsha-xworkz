public class CharArray{
	public static void main(String args[])
	{
		System.out.println("invoked main method by JVM");
		arrayOfLetters();
		System.out.println("exiting main method by JVM");
	}
	public static void arrayOfLetters()
	{
		System.out.println("invoked arrayOfLetters");
		
		char firstLetter='A';
		char thirdLetter='C';
		char fifthLetter='E';
		char seventhLetter='G';
		char ninthLetter='I';
		char eleventhLetter='K';
		char thirteenthLetter='M';
		char fifteenthLetter='O';
		char seventeenthLetter='Q';
		char ninteenthLetter='S';
		
		char[] letters={firstLetter,thirdLetter,fifthLetter,seventhLetter,ninthLetter,
		eleventhLetter,thirteenthLetter,fifteenthLetter,seventeenthLetter,ninteenthLetter};
		
		int sizeOfArray=letters.length;
		System.out.println("Total elements: "+sizeOfArray);
		
		char elementAtIndex0=letters[0];
		System.out.println("Element at index Zero: "+elementAtIndex0);
		
		char elementAtIndex2=letters[2];
		System.out.println("Element at index two: "+elementAtIndex2);
		
		char elementAtIndex4=letters[4];
		System.out.println("Element at index four: "+elementAtIndex4);
		
		char elementAtIndex6=letters[6];
		System.out.println("Element at index six: "+elementAtIndex6);
		
		char elementAtIndex8=letters[8];
		System.out.println("Element at index eight: "+elementAtIndex8);
	}
}
