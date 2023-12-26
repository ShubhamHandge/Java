
/*TODO 8:
		Create a file course_data.txt and fill the information into that file as per the format given below:
		<ID>:<Title>:<Provier>:<Duration>:<Fees>
		
		E.g.
		101:Core Java:Udemy:50:5500
		
		Write a program that reads the data from this file line by line, converts that data available in that line into
		Course object and directly prints that object.
		*/
package Course_ToDo8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader_SplitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "./src/Course_ToDo8/course_data.txt";
		try(FileReader fr = new FileReader(filePath);
				BufferedReader br = new BufferedReader(fr);
				){
			while(true) {
				String line = br.readLine();//Reading the data line by line
				if(line==null)
					break;
				//Dividing the line into sections
				//This is done using String class's split() method
				String data [] = line.split(":");
			     String courseID=  data[0];
			     String courseTitle=  data[1];
			     String courseprovider=  data[2];
			     String courseDuration=  data[3];
			     String courseFees=  data[4];
			     System.out.println("courseID is: "+courseID+"\tcourseTitle is:"+courseTitle+"\tcourseprovider is:"+courseprovider+"\tcourseDuration is: "+courseDuration+"\tcourseFees is:"+courseFees);

				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
