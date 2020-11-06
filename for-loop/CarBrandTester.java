public class CarBrandTester{
	public static void main(String[] brands)
	{
		System.out.println("JVM invoked main");
		String[] value=CarBrand.getBrands();
		for(int car=0;car<value.length;car++)
		{
			System.out.println("index value: "+car);
			String brand=value[car];
			System.out.println("brand:"+brand);
		}
		System.out.println("EXIT :: main");
	}	
}
