package day9;

import java.util.ArrayList;
import java.util.List;

public class TypeUnsafeCollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List countryNames = new ArrayList();
		countryNames.add("India");
		countryNames.add("England");
		countryNames.add("South Africa");
		countryNames.add("New Zealand");
		countryNames.add("Sri Lanka");
		countryNames.add(100.45f);
		
		//Printing the country names in Upper Case
		for(Object obj : countryNames) {
			String countryName = (String)obj;
			System.out.println(countryName.toUpperCase());
		}
	}

}
