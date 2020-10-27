public class BatteryTester{
	public static void main(String[] bats)
	{
		System.out.println("JVM invoked main from BatteryTester");
		
		byte chargeValue=IPhone.charging(-45);
		System.out.println("return value from charging:"+chargeValue);
		
		System.out.println("EXIT :: main");
	}
}