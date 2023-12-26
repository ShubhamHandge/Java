
/*TODO 7:
			Create a file course_info.txt and add some information into it.
			Write a main program that accepts 2 command line arguments indicating the source file name and
			the destination file name and the program must copy the contents of source file into destination file.
			
			Display appropriate message if the source file with the given name is not available.
			
			Implement this using standard practices.
			(Hint: Make use of StringBuilder)
//		*/


package Course_ToDo7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CourseFileRead_WriteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourceFile = String.valueOf(args[0]); 
		String DestinationFile = String.valueOf(args[1]);
				
		String path = "./src/Course_ToDo7/";
	
		String filePathSourse = path+ sourceFile;
		String filePathDestination = path+DestinationFile;
		
		try(FileInputStream fin = new FileInputStream(filePathSourse);
				BufferedInputStream bin = new BufferedInputStream(fin);
				FileOutputStream fout = new FileOutputStream(filePathDestination ,true);
				BufferedOutputStream bout = new BufferedOutputStream(fout);
				){
			while(true) {
				 int data = bin.read();
				 if(data ==-1) {
					 break;
					 
				 }
				 bout.write(data);
			}
			
			 System.out.println("data hs been read and written sucessfully");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
