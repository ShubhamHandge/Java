package day11;

public class MathCalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathCalculator  adder = (a,b) -> a+b; //give return type to both or not give to anyone
		MathCalculator substract = (p,q) -> {
			return p-q;
		};
		
		int addition = adder.doCalculate(10, 20);
		int substraction = substract.doCalculate(10, 20);
		
		System.out.println(addition);
			System.out.println(substraction);
		
		
	}

}
