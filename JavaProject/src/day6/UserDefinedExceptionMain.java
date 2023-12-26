package day6;
//This example illustrates the use of: throws, throw and User Defined Exception
public class UserDefinedExceptionMain {

	public static void main(String[] args) {
				try {
			int position = NameCollection.getPosition("Ranbir");
			System.out.println(position);
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
