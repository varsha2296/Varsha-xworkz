enum Direction 
{
	NORTH,SOUTH,EAST,WEST,NORTHEAST,SOUTHEAST,NORTHWEST,SOUTHWEST
}

public class DirectionTester{
	public static void main(String[] names)
	{
		String directions="WEST";
	
		Direction convertedDirectionFromString=Direction.valueOf(directions);
	
		System.out.println(convertedDirectionFromString);
		Direction[] allDirections=Direction.values();
		System.out.println(allDirections.length);
		//length will be +1 of index
		for(int initialDirection=0;initialDirection<allDirections.length;initialDirection++)
		{
			System.out.println("index:"+initialDirection);
			Direction directionValue=allDirections[initialDirection];
			System.out.println("Direction enum Value:"+directionValue);
		}
	}
}