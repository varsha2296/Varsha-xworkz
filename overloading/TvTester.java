public class TvTester{
	public static void main(String[] rate)
	{
		System.out.println("JVM invoked main");	
		System.out.println("main method args length: "+rate.length);	
        
		String sportsChannel="English";
		Tv.channels(sportsChannel);

		Tv.channels("starSports",4);
		
		Tv.channels("Hockey","team");

		System.out.println("EXIT :: main");	
	}
}