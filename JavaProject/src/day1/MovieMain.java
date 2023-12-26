package day1;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1 = new Movie();
		m1.setTitle("Biography");
		m1.setGenre("Wings of fire");
		m1.setYear(1990);
		
		System.out.println("TITLE: "+m1.getTitle());
		System.out.println("YEAR: "+m1.getYear());
		
		System.out.println("GENRE: "+m1.getGenre());
		
		              //or
		String movieGenre = m1.getGenre();
		System.out.println("Genre: " + movieGenre);
	}

}
