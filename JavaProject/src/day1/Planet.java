package day1;
//This example illustrates the use of Abstraction and Encapsulation

public class Planet {

	private String name;
	private int moon;
	
	//Fields 'name' and 'moons' are declared as 'private'; hence they are not accessible from outside this class.
	
	//Adding methods for assigning and retrieving values
	public void assignValues(String a,int b) {
		name = a;
		moon = b;
	}
	
	public String retriveValues() {
		String planetInfo = name + "," + moon;
		return planetInfo;
	}
	
}
