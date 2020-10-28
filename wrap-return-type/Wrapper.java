public class Wrapper{
	public static void main(String[] values)
	{
		System.out.println("JVM invoked main");
		System.out.println("The Program will convert string to all primitives");
		
		String houseNo="38";
		byte convertedHouseNo=Byte.parseByte(houseNo);
		System.out.println("converted byte: "+convertedHouseNo);
		
		String plotNo="369";
		short convertedPlotNo=Short.parseShort(plotNo);
		System.out.println("converted short: "+convertedPlotNo);
		
		String salary="70000";
		int convertedSalary=Integer.parseInt(salary);
		System.out.println("converted integer: "+convertedSalary);
		
		String numOfSearchEngines="240000000";
		long convertedNumOfSE=Long.parseLong(numOfSearchEngines);
		System.out.println("converted long: "+convertedNumOfSE);
		
		String waterInLiter="2.5";
		float convertedWaterInL=Float.parseFloat(waterInLiter);
		System.out.println("converted float: "+convertedWaterInL);
		
		String area="26.5555";
		double convertedArea=Double.parseDouble(area);
		System.out.println("converted double: "+convertedArea);
		
		String iHaveChocolates="true";
		boolean convertedBool=Boolean.parseBoolean(iHaveChocolates);
		System.out.println("converted boolean: "+convertedBool);
		
		String division="B";
		char convertedDivision=division.charAt(0);
		System.out.println("converted character: "+convertedDivision);
		
		System.out.println("EXIT :: main");
	}	
}