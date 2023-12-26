package day2;

public class ArraySimpleMain {

		public static void main(String[] args) {
			// Declaring an array of 5 integers.
			int numbers[] = new int[5]; 
			//Initializing the array
			numbers[0] = 34;
			numbers[1] = 134;
			numbers[2] = 234;
			numbers[3] = 1234;
			numbers[4] = 334;
			
			//Declaring and initializing the array simultaneously
			int numberList[] = {10, 45, 87, 34, 99 }; 
			int size = numberList.length;
			//Printing the numbers from start to end
			for(int index = 0; index < size; index++) {
				int number = numberList[index];
				System.out.println(number);
			}
			System.out.println("---------------------------------------");
			//Printing the numbers from start to end using For-Each (Enhanced For) loop
			for(int number : numberList)
				System.out.println(number * number);
			
			

		}
	}


