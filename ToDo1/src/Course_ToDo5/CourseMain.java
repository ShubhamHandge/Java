package Course_ToDo5;

public class CourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course[]=new Course[3];
		
		course[0]=new Course(101, "C", 100, "Udemy", 5500);
		course[1]=new Course(102, "C++", 100, "Udemy", 5500);
		course[2]=new Course(103, "Java", 200, "Coursera", 6000);
		
		CourseInfo courInfo=new CourseInfo("Udemy", 100);
		
		CourseInfoProcessor courInfoPr=new InterfaceTotalCount();
		System.out.println("Count is: "+courInfoPr.processCourseInfo(course, courInfo));
		
		courInfoPr=new InterfaceTotalAvgFees();
		System.out.println("Average is : "+courInfoPr.processCourseInfo(course, courInfo));
		
		

	}

}
