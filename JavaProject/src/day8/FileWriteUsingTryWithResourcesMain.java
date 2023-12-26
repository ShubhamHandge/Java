package day8;

import java.io.FileOutputStream;

public class FileWriteUsingTryWithResourcesMain {

	public static void main(String[] args) {
		String filePath = "ice_creams.txt";
		String ice_cream_data = "\n1. Keshar Pista\n2. Vanilla\n3.mango\n4.Ilayachee\n5.Pestry";
		try (FileOutputStream fout = new FileOutputStream(filePath, true)) {
			//Converting the String data into a byte array because the 
			byte [] ice_cream_info = ice_cream_data.getBytes();
			fout.write(ice_cream_info);
			System.out.println("Data has been written to file.");

		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

