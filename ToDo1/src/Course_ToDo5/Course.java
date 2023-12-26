package Course_ToDo5;

import java.util.Objects;

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


	}
	@Override
	public int hashCode() {
		return Objects.hash(Duration, Provider);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Duration == other.Duration && Objects.equals(Provider, other.Provider);
	}
	
	

}
