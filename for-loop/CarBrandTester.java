public class CarBrandTester{
	public static void main(String[] brands)
	{
	
		System.out.println("JVM invoked main");
		
		for(int car=0;car<brands.length;car++)
		{
			System.out.println("index value: "+car);
			String brand=brands[car];
			System.out.println("brand:"+brand);
		}
		//return brandName;
		System.out.println("EXIT :: main");
	}
	
}