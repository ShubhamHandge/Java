package day3;

public class PlayerInheritenceMain2 {

	public static void main(String[] args) {
		CricketPlayer cp = new CricketPlayer("Ramya",12,22.44f);
		TennisPlayer tp =  new TennisPlayer("shmaya",43,566);
		
		System.out.println(cp.getAge());
		System.out.println(tp.getAces());
		
		}

}
