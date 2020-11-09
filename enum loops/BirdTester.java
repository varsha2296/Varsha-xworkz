enum Bird
{
	PARROT,EAGLE,HUMMINGBIRD,KINGFISHER,OWL,SPARROW,WOODPECKER,SWIFT,PIGEON,DOVE
}

public class BirdTester{
	public static void main(String[] birds)
	{
		String birdTypes=birds[0];
	
		Bird convertedBirdFromString=Bird.valueOf(birdTypes);
	
		System.out.println(convertedBirdFromString);
	}
}	