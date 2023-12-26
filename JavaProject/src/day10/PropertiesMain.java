package day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JFrame;

public class PropertiesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties winProps = new Properties();
		String filePath = "./src/day10/window.properties";
		try(FileInputStream fin = new FileInputStream(filePath);
				){
			//Loading the properties from PROPERTIES file referred through 'fin' into the Properties object: 'winProps'
			winProps.load(fin);
			String appTitle = winProps.getProperty("title");
			String appWidth = winProps.getProperty("width");
			String appHeight = winProps.getProperty("height");
			//System.out.println(appTitle + " " + appWidth + " " + appHeight);			
			int width = Integer.parseInt(appWidth);
			int height = Integer.parseInt(appHeight);
			
			JFrame myFrame = new JFrame();
			myFrame.setTitle(appTitle);
			myFrame.setSize(width, height);
			myFrame.setVisible(true);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
