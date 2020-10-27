public class IPhoneTester{
	public static void main(String[] models)
	{
		System.out.println("JVM invoked main from IPhoneTester");
		
		boolean connect=IPhone.call();
		System.out.println("return value from call:"+connect);
		
		String sandesha=IPhone.message();
		System.out.println("return value from mgs:"+sandesha);
		
		System.out.println("EXIT :: main");
	}
}