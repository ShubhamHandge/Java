package day9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "./src/day9/movie.txt";
		try (FileOutputStream fout = new FileOutputStream(filePath);
				ObjectOutputStream out =new ObjectOutputStream(fout);
				){
			//Creating the Movie class object
			Movie currentMovie = new Movie("Gadar 2", "Action", 2023);
			//Serializing the Movie class object
			out.writeObject(currentMovie);
			System.out.println("Movie object has been serialized successfully.");
			
		} catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
