enum Language
{	
	ENGLISH,KANNADA,HINDI,TELUGU,MARATHI
}

public class LanguageTester{
	public static void main(String[] names)
	{
		String languages="HINDI";
	
		Language convertedLanguageFromString=Language.valueOf(languages);
	
		System.out.println(convertedLanguageFromString);
		Language[] allLanguages=Language.values();
		System.out.println(allLanguages.length);
		//length will be +1 of index
		for(int spokenLanguage=0;spokenLanguage<allLanguages.length;spokenLanguage++)
		{
			System.out.println("index:"+spokenLanguage);
			Language languageValue=allLanguages[spokenLanguage];
			System.out.println("Language enum Value:"+languageValue);
		}
	}
}