package day9;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>countryNames = new HashSet<>();
		countryNames.add("India"); 
		countryNames.add("India");
		countryNames.add("India");
		countryNames.add("India");
		countryNames.add("India");
		countryNames.add("England");
		countryNames.add("South Africa");
		countryNames.add("New Zealand");
		countryNames.add("Sri Lanka");
		
		for(String country : countryNames)
		{
			System.out.println(country);
		}
	}

}
