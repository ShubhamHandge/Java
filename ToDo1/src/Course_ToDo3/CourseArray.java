

/*TODO 3:
		Enhance CMS as per the following:
			
		Create a class CourseProcessor and add following method:
			public static void printShortDurationCourseNames(Course [ ])
			
		The method must accept array of type Course and print the names of the courses having short duration.
		(The duration is considered as SHORT if it is less than 40 Hrs)
		
		Write the main program to test this functionality.
	 */






package Course_ToDo3;

public class CourseArray {
	
	public int CourseID;
	public String Title;
	public int Duration;
	public String Provider;
	public int Fees;
	private static int counting;
	
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
	public static int getCounting() {
		return counting;
	}
	public CourseArray(int courseID, String title, int duration, String provider, int fees) {
		super();
		CourseID = courseID;
		Title = title;
		Duration = duration;
		Provider = provider;
		Fees = fees;
		counting++;
	}
	public void Display() {
		System.out.println("CouseID is: " + CourseID);
		System.out.println("Title is : " + Title);
		System.out.println("Duration is : " + Duration);
		System.out.println("Provider is: " +  Provider);
		System.out.println("Fees is: " + Fees);
		System.out.println("-------------------------------");


	}

}
