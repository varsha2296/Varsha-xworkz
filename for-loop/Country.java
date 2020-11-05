public class Country{
	public static void main(String[] words)
	{
		System.out.println("JVM invoked main");
		
		System.out.println("Program to print all the country names given as arguments to the main method");
		
		for(int map=0;map<words.length;map++)
		{
			System.out.println("index value: "+map);
			String countryName=words[map];
			System.out.println("country names: "+countryName);
		}
		System.out.println("EXIT :: main");
	}	
}