package Course_ToDo4;

import Course_ToDo1.Course;

/*TODO 4:
	Create an abstract class CourseDataCalculator as per the following:
	
	public abstract class CourseDataCalculator {
		public abstract float doCalculation(Course [] allCourses);		
	}
	
	Create 2 subclasses of CourseDataCalculator with following functionalities:
	(Subclass names are of your choice)
	
	SubClass 1: 
		Returns the average duration of all courses
	
	Subclass 2:
		Returns the average fees of all courses
		
	Write a main program to test the functionality.
*/



public abstract class CourseDataCalculator {
	
	public abstract float doCalculation(Course [] allCourses);		

}

