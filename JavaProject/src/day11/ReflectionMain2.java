package day11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMain2 {

	private static void printClassInfo(String className) throws ClassNotFoundException {
		//Loading the class explicitly
		Class loadedClass = Class.forName(className);
		//Obtaining a list of methods available in this loaded class
		System.out.println("-----------Method Names-----------");
		Method[]	allMethods = loadedClass.getDeclaredMethods();
		for(Method currentMethod : allMethods) {
			String methodName = currentMethod.getName();
			System.out.println(methodName);
		}
	
	//Obtaining a list of fields available in this loaded class
		System.out.println("-----------Field Names-----------");
		Field[] allFeilds =	loadedClass.getDeclaredFields();
		for(Field currentField : allFeilds) {
			String fieldName = currentField.getName();
			System.out.println(fieldName);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			printClassInfo("day11.TrainingProgram");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
