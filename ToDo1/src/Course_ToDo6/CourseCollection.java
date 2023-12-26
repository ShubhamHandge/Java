package Course_ToDo6;

import Course_ToDo5.Course;
//import day6.NameNotFoundException;

public class CourseCollection {
	private static Course[] availableCourses;
	
	static
	{
		availableCourses = new Course[3];
		availableCourses[0]=new Course(101, "C", 100, "Udemy", 5500);
		availableCourses[1]=new Course(102, "C++", 100, "Udemy", 5500);
		availableCourses[2]=new Course(103, "Java", 200, "Coursera", 6000);
	}

	public static String printCourseNames(String provider) throws ProviderNotFoundException {
		
		String courseName = " ";
		for (Course currecourse : availableCourses ) {
			
			String latestName = currecourse.getProvider();
			
			if(latestName.equals(provider)) {
				
				courseName +="\n"+ currecourse.getTitle();
			}		
		}
		if(courseName == " ") {
			String error = "The entered name is invalid. It is not available";
			ProviderNotFoundException nx = new ProviderNotFoundException(error,provider);
			throw nx;
		}
		//System.out.println(courseName);
		return courseName;
	}
}
