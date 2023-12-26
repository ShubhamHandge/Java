package Course_ToDo4;

import Course_ToDo1.Course;

public class AvgFees extends CourseDataCalculator {

	@Override
	public float doCalculation(Course[] allCourses) {
		int totalCourseFees = 0;
		for(Course currentcourse : allCourses)
		{
			totalCourseFees =  totalCourseFees + currentcourse.getFees();
			 
		}
		float FinalFees = totalCourseFees/allCourses.length;
	
		return FinalFees;

		
	}

}
