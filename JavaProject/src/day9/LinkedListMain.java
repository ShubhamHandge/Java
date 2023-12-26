package day9;

import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList dataValues = new LinkedList();
		dataValues.add("Hello");
		dataValues.add("Welcome");
		dataValues.add(35);
		dataValues.add(true);
		dataValues.add(4.56);
		
		for(Object obj : dataValues)
			System.out.println(obj);
		dataValues.addFirst("AAA");
		dataValues.addLast("ZZZ");
		
		System.out.println("---------------------------");
		for(Object obj : dataValues)
			System.out.println(obj);
		
		

	}

}
