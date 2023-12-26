package day8;

import java.io.RandomAccessFile;

public class RandomAccessFileMain {
	//Demonstrating the use of RandomAccessFile class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "./src/day8/FileClassTrial/animals.txt";
		try (
				RandomAccessFile rf = new RandomAccessFile(filePath, "r")//Opening this file for reading
			){
			long fileSize = rf.length();
			long midPosition = fileSize/2;
			rf.seek(midPosition); 			//Placing the file pointer directly at the mid position
			while(true) {
				int data = rf.read();
				if(data == -1)
				break;
				System.out.print((char)data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
