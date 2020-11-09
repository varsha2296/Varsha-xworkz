enum Bag
{
	SCHOOLBAG,COLLEGEBAG,SHOULDERBAG,LUNCHBAG,BACKPACK,LAPTOPBAG,POUCH,SHOPPINGBAG,HANDBAG
}

public class BagTester{
	public static void main(String[] names)
	{
		String bagTypes="HANDBAG";
	
		Bag convertedBagFromString=Bag.valueOf(bagTypes);
	
		System.out.println(convertedBagFromString);
		Bag[] allBags=Bag.values();
		System.out.println(allBags.length);
		//length will be +1 of index
		for(int bags=0;bags<allBags.length;bags++)
		{
			System.out.println("index:"+bags);
			Bag bagsValue=allBags[bags];
			System.out.println("Bag enum Value:"+bagsValue);
		}
	}
}