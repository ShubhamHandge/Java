package day4;

public class ShapeAbstractClassMain {

	public static void main(String[] args) {
		//Shape sh = new Shape(); This is invalid as Shape class is abstract. Its object creation is not possible.
		Shape sh;
		sh  = new Circle();
		sh.draw();
		
		sh = new Rectangle();
		sh.draw();
		
		}

}
