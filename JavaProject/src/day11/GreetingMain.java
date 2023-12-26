package day11;

public class GreetingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greeting1 = () -> "heyy";
		Greeting greeting2 = () -> {
			String message = "nyyyy";
			return message;
		};
		
		String firstGreeting = greeting1.sayGreeting();
		String SecondGreeting = greeting2.sayGreeting();
		
		System.out.println(firstGreeting);
		System.out.println(SecondGreeting);

		
	}

}
