package Course_ToDo4;

import Course_ToDo1.Course;

public class AvgDuration extends CourseDataCalculator {

	@Override
	public float doCalculation(Course[] allCourses) {
		int totalCourseDuration = 0;
		for(Course currentcourse : allCourses)
		{
			 totalCourseDuration =  totalCourseDuration + currentcourse.getDuration();
			 
		}
		float FinalAvg = totalCourseDuration/allCourses.length;
	
		return FinalAvg;
	}
	
	

}
