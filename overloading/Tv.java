public class Tv{	
	public static void channels(String lang)
	{
		System.out.println("invoked channels");
		System.out.println("arg lang: "+lang);	
	}
	public static void channels(String sportsChannel,String noOfSportsChannels)
	{
		System.out.println("invoked channels with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 sportsChannel: "+sportsChannel);
		System.out.println("arg2 noOfSportsChannels: "+noOfSportsChannels);
	}
	public static void channels(String sportsChannel,int noOfSportsChannels)
	{	
		System.out.println("invoked channels with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 sportsChannel: "+sportsChannel);
		System.out.println("arg2 noOfSportsChannels: "+noOfSportsChannels);
	}
	public static void channels(int noOfSportsChannels,String sportsChannel)
	{
		System.out.println("invoked channels with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 noOfSportsChannels: "+noOfSportsChannels);
		System.out.println("arg2 sportsChannel: "+sportsChannel);	
	}
}