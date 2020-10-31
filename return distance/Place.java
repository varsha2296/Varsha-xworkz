public class Place{
	public static String finder(int distanceInKMs){
		System.out.println("invoked finder");
		
		int distance=distanceInKMs;
		int minimumDistance=50;
		
		if(distance<=minimumDistance){
			System.out.println("Minimum distance sould be greater than"+minimumDistance+"kms");
			return "Not available";
		}
		if(distance>70 && distance<100){
			System.out.println("Distance is between 70 and 100");
			return "Haveri";
		}
		if(distance>100 && distance<150){
			System.out.println("Distance is between 100 and 150");
			return "Dandeli";
		}
		if(distance>150 && distance<200){
			System.out.println("Distance is between 150 and 200");
			return "Belgaum";
		}
		if(distance>200 && distance<300){
			System.out.println("Distance is between 200 and 300");
			return "Shivamogga";
		}
		System.out.println("Exit :: finder");
		return "place not found";
	}
	public static String finder(int startDistance,int endDistance){
		System.out.println("invoked finder int and int");
		
		System.out.println("startDistance: "+startDistance);
		System.out.println("endDistance: "+endDistance);
		
		int start=startDistance;
		int end=endDistance;
		int minimumDistance=50;
		if(start<=minimumDistance || end<=minimumDistance)
		{
			System.out.println("Minimum distance sould be greater than"+minimumDistance+"kms");
			return "Not available";
		}
		System.out.println("EXIT :: finder diatance");
		return "Place not found";
	}
}