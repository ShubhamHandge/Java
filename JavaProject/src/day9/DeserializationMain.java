package day9;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "./src/day9/movie.txt";
		try(FileInputStream fin =new FileInputStream(filePath);
				ObjectInputStream in = new ObjectInputStream(fin);
				){
			//De-serializing the Movie class object.
			Object currObject =in.readObject();
			System.out.println(currObject);
			//currentObject.getTitle(); This does not compile because Object class does not have getTitle() method
			Movie currMovie = (Movie)currObject;
			String movieTitle = currMovie.getTitle();
			System.out.println(movieTitle);			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
