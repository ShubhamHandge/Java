package Course_ToDo9;

import java.io.Serializable;
import java.util.Objects;

public class Course implements Serializable {
	public int CourseID;
	public String Title;
	public int Duration;
	public String Provider;
	public int Fees;
	
	public Course() {
		super();
	}

	public Course(int courseID, String title, int duration, String provider, int fees) {
		super();
		CourseID = courseID;
		Title = title;
		Duration = duration;
		Provider = provider;
		Fees = fees;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(CourseID, Duration, Fees, Provider, Title);
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
		return CourseID == other.CourseID && Duration == other.Duration && Fees == other.Fees
				&& Objects.equals(Provider, other.Provider) && Objects.equals(Title, other.Title);
	}

	@Override
	public String toString() {
		return "Course [CourseID=" + CourseID + ", Title=" + Title + ", Duration=" + Duration + ", Provider=" + Provider
				+ ", Fees=" + Fees + "]";
	}
	
	
	
	
	

}
