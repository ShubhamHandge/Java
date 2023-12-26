package day2;

public class ParameterPassingMain {

	public static void main(String[] args) {
		
			int x = 10;
			System.out.println(x);
			changeX(x);
			System.out.println(x);
			
			System.out.println("---------------------------------------");
			
			Fruit f1 = new Fruit("Apple", "Red");
			System.out.println(f1.getName() + ", "  + f1.getColor());
			changeFruit(f1);
			System.out.println(f1.getName() + ", "  + f1.getColor());
		}
		private static void changeFruit(Fruit f1Ref) {
			// TODO Auto-generated method stub
			f1Ref.setName("Orange");
			f1Ref.setColor("Orange");
			
		}
		private static void changeX(int y) {
			// TODO Auto-generated method stub
			y = 20;
			
		}
	

}
