package Course_ToDo4;

import Course_ToDo1.Course;

public class CourseDataCalculatorMain {

	public static void main(String[] args) {

		Course [] crrArray= new Course[3];
		crrArray[0] = new Course(1,"C++",30,"Udemy",2340);
		crrArray[1] = new Course(1,"C",45,"Udemy",5040);
		crrArray[2] = new Course(1,"java",28,"Udemy",5670);

		CourseDataCalculator cdc;
		
		cdc = new AvgDuration();
		System.out.println("Avrg of Courses duration is :"+ cdc.doCalculation(crrArray));
		
		CourseDataCalculator cdc2;
		cdc2 = new AvgFees();
		System.out.println("Avrg of Courses fees  is :"+ cdc2.doCalculation(crrArray));

		}	
	
	


}
