/*
 TODO 9:
		Write a program that accepts input from user about the number of courses for which the data to be entered.
		According to that build an array of Course objects with that dimension.
		
		Fill the array with Course objects where the information is accepted from user.
		
		Serialize the whole array into some file.
		
		Write another program to perform de-serialization and display all the course details.
*/
package Course_ToDo9;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Serialization_DeSerializationClass {
	
	public void serializeMethod(Course [] course)
	{
		String filePath="./src/Course_ToDo9/courseData.txt";
		
		try(
				FileOutputStream fout=new FileOutputStream(filePath);
				ObjectOutputStream out=new ObjectOutputStream(fout);
			)
		{
			//Course[] courseList=new Course[5];
			for(int i=0;i<course.length;i++) {
				out.writeObject(course[i]);

			}
			System.out.println("Course Object Has been Serialized.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void deSerializeMethod(Course[] courseList)
	{
		String filePath="./src/Course_ToDo9/courseData.txt";
		int size=courseList.length;
		try(
				FileInputStream fin=new FileInputStream(filePath);
				ObjectInputStream in=new ObjectInputStream(fin);
				)
		{
			
			for(int i=0;i<size;i++) {
				Object currentObject=in.readObject();
				//System.out.println(currentObject);
				Course course=(Course)currentObject;
				
				//System.out.println(currentObject);
				System.out.println(course.toString());
			}
			
			System.out.println("DeSerialize Has succesfully.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(EOFException ex)
		{
			ex.printStackTrace();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

		
		
	
	

}
