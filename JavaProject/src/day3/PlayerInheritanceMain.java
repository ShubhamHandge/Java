package day3;

public class PlayerInheritanceMain {
	public static void main(String[] args) {
		
		Player p  = new  Player();
		p = new Player("ram",34);
		p = new Player(34,"ram");

		
		CricketPlayer cp = new CricketPlayer();
		TennisPlayer tp = new TennisPlayer();
		cp.setName("Virat");
		cp.setAge(35);
		cp.setBattingAvg(56.75f);
		
		
		
		System.out.println(cp.getName());
		System.out.println(cp.getAge());
		System.out.println(cp.getBattingAvg());
		
		
		

		
	}

}
