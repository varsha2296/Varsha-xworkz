public class PlaceFinder{
	public static void main(String[] place){
		System.out.println("JVM invoked main");
		
		String placeAtIndex0=place[0];
	
		int distance=Integer.parseInt(placeAtIndex0);
		
		String sthala=Place.finder(distance);
		System.out.println("sthala:"+sthala);
		
		String placeAtI0=place[0];
	    String placeAtI1=place[1];
		
		int startDistance=Integer.parseInt(placeAtI0);
		int endDistance=Integer.parseInt(placeAtI1);
		
		String between=Place.finder(startDistance,endDistance);
		System.out.println("between:"+between);
		
		System.out.println("Exit:: main");
	}
}