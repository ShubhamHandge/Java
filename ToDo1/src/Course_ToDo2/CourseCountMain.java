package Course_ToDo2;

public class CourseCountMain {

	public static void main(String[] args) {
		CourseCount obj = new CourseCount(1,"C++",50,"Udemy",5000);
		obj.Display();
		
		CourseCount obj2 = new CourseCount(2,"C",70,"Udemy",5000);
		obj2.Display();
		
		System.out.println("Count is: " + CourseCount.getCounting());
		
	}

}
