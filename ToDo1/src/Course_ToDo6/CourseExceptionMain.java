package Course_ToDo6;

/*TODO 6:
	Create a class CourseCollection as per the following:
		private static Course[] availableCourses
	
	When this class is loaded, the static array must be filled with some Course objects.
	(Hint: Make use of 'static' block)
	
		Provide a method:
				public static void printCourseNames(String provider) throws ProviderNotFoundException
		
		The method must display names of the courses offered by the provider.
		The method must throw ProviderNotFoundException if the supplied provider name is invalid.
		
		***ProviderNotFoundException must be a CHECKED exception.
		
		Write a main program to test this functionality.
		
		****Display appropriate message if the provider is invalid.

*/
public class CourseExceptionMain {

	public static void main(String[] args) {

		String finalcourseName;
		try {
			finalcourseName = CourseCollection.printCourseNames("Udemy");
			System.out.println(finalcourseName);

		} catch (ProviderNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
