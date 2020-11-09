enum Disease
{
	HEADACHE,FEVER,COUGH,COLD,COVID,MALARIA,TB,PNEUMONIA,TYPHOID
}

public class DiseaseTester{
	public static void main(String[] names)
	{
		String diseases="TB";
	
		Disease convertedDiseasesFromString=Disease.valueOf(diseases);
	
		System.out.println(convertedDiseasesFromString);
		Disease[] allDisease=Disease.values();
		System.out.println(allDisease.length);
		//length will be +1 of index
		for(int commonDisease=0;commonDisease<allDisease.length;commonDisease++)
		{
			System.out.println("index:"+commonDisease);
			Disease diseaseValue=allDisease[commonDisease];
			System.out.println("Disease enum Value:"+diseaseValue);
		}
	}
}