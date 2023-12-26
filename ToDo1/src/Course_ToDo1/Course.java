
/*Case Study: Course Management System
		
		CMS is dealing with Online courses offered by various platforms e.g. Udemy, Coursera, Edureka and so on.
		
		It mainly involves an entity: Course which handles following information:
			1. Course ID (Number without Decimal)
			2. Title (Character Based)
			3. Duration (Hrs) (Number without Decimal)
			4. Provider (E.g. Udemy, Coursera, Edureka) (Character Based) 
			5. Fees (Number without Decimal)
			
	   TODO 1 :
	   		Create an entity class for handling course related information with attributes, getters, setters, constructors
	   		and test its functionality
	   		
	   	Naming Conventions:
	   		1. Class names should be in TitleCase
	   		2. Variable names should be in camelCase
	   		3. Method names should be in camelCase
	   		4. Package names should be in lowercase
*/




package Course_ToDo1;

public class Course {
	
	public int CourseID;
	public String Title;
	public int Duration;
	public String Provider;
	public int Fees;
	
	public int getCourseID() {
		return CourseID;
	}
	public void setCourseID(int courseID) {
		CourseID = courseID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	public String getProvider() {
		return Provider;
	}
	public void setProvider(String provider) {
		Provider = provider;
	}
	public int getFees() {
		return Fees;
	}
	public void setFees(int fees) {
		Fees = fees;
	}
	
	
	public Course(int courseID, String title, int duration, String provider, int fees) {
		super();
		CourseID = courseID;
		Title = title;
		Duration = duration;
		Provider = provider;
		Fees = fees;
	}
	
	public void Display() {
		System.out.println("CouseID is: " + CourseID);
		System.out.println("Title is : " + Title);
		System.out.println("Duration is : " + Duration);
		System.out.println("Provider is: " +  Provider);
		System.out.println("Fees is: " + Fees);
		System.out.println("---------------------");


	}
	

}
