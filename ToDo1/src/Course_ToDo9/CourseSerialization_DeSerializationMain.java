package Course_ToDo9;

import java.io.InputStream;
import java.util.Scanner;

public class CourseSerialization_DeSerializationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream keyboard=System.in;
		
		try(Scanner valueScanner=new Scanner(keyboard))
		{
			System.out.println("Enter the Number Of Courses to Print: ");
			int size=valueScanner.nextInt();
			valueScanner.nextLine();
			
			
			Course[] courseList=new Course[size];
			
			for(int i=0;i<size;i++)
			{
				System.out.println("Enter Course ID: ");
				int courseId=valueScanner.nextInt();
				valueScanner.nextLine();
				
				System.out.println("Enter Course Title: ");
				String courseTitle=valueScanner.next();
				valueScanner.nextLine();
				
				System.out.println("Enter Course Duration: ");
				int courseDuration=-valueScanner.nextInt();
				valueScanner.nextLine();
				
				System.out.println("Enter Course Provider: ");
				String coureProvider=valueScanner.next();
				valueScanner.nextLine();
				
				System.out.println("Enter Course Fees: ");
				int courseFees=valueScanner.nextInt();
				valueScanner.nextLine();
				
				courseList[i]=new Course(courseId, courseTitle, courseDuration, coureProvider, courseFees);
			}
			
			//System.out.println("End Of Course Object.");
			
			
			Serialization_DeSerializationClass courseSerialize=new Serialization_DeSerializationClass();
			
			courseSerialize.serializeMethod(courseList);
			
			courseSerialize.deSerializeMethod(courseList);
			
			//System.out.println("Enter Your Choice: ");
			//int choice=valueScanner.nextInt();
			//valueScanner.nextLine();
			
			
				
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

	
	

}
