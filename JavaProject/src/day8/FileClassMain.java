package day8;

import java.io.File;
import java.io.IOException;

public class FileClassMain {
	
	//Demonstrating the use of File class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirpath = "./src/day8/FileClassTrial";
		File currentDirectory = new File(dirpath);
		if(currentDirectory.exists()) {
			//System.out.println("Directory found");
			
			String filePath = dirpath+"/animals.txt";
			File currentFile = new File(filePath);
			
			if(currentFile.exists()) {
				System.out.println("File found");
			  }else {
				System.out.println("File Not found");
				try {
					currentFile.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else {
			System.out.println("Directory Not found");
			currentDirectory.mkdir(); //Makes a directory
		}
	}

}
