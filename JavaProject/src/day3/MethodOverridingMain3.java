package day3;

public class MethodOverridingMain3 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Training trg;
			trg = new OfflineTraining("OOP using Java", 10, "YCP, Mumbai");
			String allDetails = trg.getDetails();
			System.out.println(allDetails);
			trg = new OnlineTraining("Node JS", 5, "http://www.zoom.us/34343");
		}
}


