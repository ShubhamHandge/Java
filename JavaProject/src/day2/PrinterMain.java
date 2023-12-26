package day2;
//This example illustrates: Method Overloading, Constructor and Constructor Overloading

public class PrinterMain {

	public static void main(String[] args) {
		Printer prn = new Printer();
		prn.setContent("Good Morning");
		prn.print("*****");
		
		Printer prn2 = new Printer("Good Night");
		prn2.print("&&&");
	}

}
