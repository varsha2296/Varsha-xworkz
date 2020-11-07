public class TheaterTester{
	public static void main(String[] names)
	{
		System.out.println("Invoked main");
		
		TheaterFinder.bestTheaterInGulbargaUsingString("Mirajcinemas");
		String theaterName="MUKTACINEMAS";
		Theater enumTheaterName=Theater.valueOf(theaterName);
		TheaterFinder.bestTheaterInGulbargaUsingEnum(enumTheaterName);
		
		System.out.println("EXIT :: main");
	}
}