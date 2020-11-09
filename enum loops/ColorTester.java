enum Color 
{
	BLACK,WHITE,RED,YELLOW,BLUE,DARKBLUE,PINK,ORANGE,GREEN,DARKGREEN,BROWN,PURPLE
}

public class ColorTester{
	public static void main(String[] names)
	{
		String colors="RED";
	
		Color convertedColorFromString=Color.valueOf(colors);
	
		System.out.println(convertedColorFromString);
		Color[] allColors=Color.values();
		System.out.println(allColors.length);
		//length will be +1 of index
		for(int initialColor=0;initialColor<allColors.length;initialColor++)
		{
			System.out.println("index:"+initialColor);
			Color colorValue=allColors[initialColor];
			System.out.println("Color enum Value:"+colorValue);
		}
	}
}