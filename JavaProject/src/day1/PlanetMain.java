package day1;

public class PlanetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet ourplanet = new Planet();
		//ourPlanet.name = "Earth"; This does not compile because 'name' is 'private'
		ourplanet.assignValues("Earth", 1);
		
		Planet biggestPlanet = new Planet();
		biggestPlanet.assignValues("Jupiter", 16);
		
		String ourplanetInfo = ourplanet.retriveValues();
		System.out.println(ourplanetInfo);
	
		System.out.println(biggestPlanet.retriveValues());

	}

}
