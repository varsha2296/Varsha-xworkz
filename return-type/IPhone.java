public class IPhone{
	public static boolean call()
	{
		System.out.println("Invoked call");
		boolean connected=true;
		return connected; 
	}	
	public static String message()
	{
		System.out.println("Invoked message");
		String mgs="Good Morning";
		return mgs;
	}
	public static byte charging(double volts)
	{
		System.out.println("Invoked charging");
		
		System.out.println("Volts:"+volts);
		
		if(volts>3){
			System.out.println("Volts is greater than 3");
			return 100;
		}
		if(volts<3 && volts>0){
			System.out.println("Volts is lesser than 3");
			return 0;
		}
		return -1;
	}
}
