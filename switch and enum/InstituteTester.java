public class InstituteTester{
	public static void main(String[] photos)
	{
		System.out.println("invoked main, doing switch and enum");

		InstituteFinder.lowestAndBestUsingString("ABC");
		String instituteName="ABC";
		Institute enumInstituteName=Institute.valueOf(instituteName);
		InstituteFinder.lowestAndBestUsingEnum(enumInstituteName);

		System.out.println("EXIT :: main, doing switch and enum");
	}
}