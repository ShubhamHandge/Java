package Course_ToDo3;

public class CourseArrayMain {

	private static void printShortDurationCourseNames(CourseArray[] courseRef) {
		for(CourseArray currentCourse : courseRef)
		{
			int currentCourseDuration = currentCourse.getDuration();
			String currentCourseTitle = currentCourse.getTitle();
			
			if(currentCourseDuration<40)
				System.out.println(currentCourseTitle);
		}
		
	}
	
	public static void main(String[] args) {

		CourseArray course[]= new CourseArray[3];
		course[0] = new CourseArray(1,"C++",50,"Udemy",5000);
		course[1] = new CourseArray(2,"C",20,"Udemy",5500);
		course[2] = new CourseArray(3,"java",35,"Udemy",5000);

		System.out.println("Duration Less Than 40 hrs is :");
		printShortDurationCourseNames(course);
	}

	

}
