import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MockMovies {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static void mockList(List<Movie> list) throws ParseException {
		Movie m1 = new Movie("JUMANJI: PR�XIMA FASE", sdf.parse("16/01/2020"), "comedia");
		Movie m2 = new Movie(" AVES DE RAPINA", sdf.parse("06/02/2020"), "A��o");
		Movie m3 = new Movie("SONIC", sdf.parse("13/02/2020"), "A��o/comedia");
		Movie m4 = new Movie("DOLITTLE", sdf.parse("20/02/2020"), "A��o/Aventura");
		Movie m5 = new Movie("MULAN", sdf.parse("26/03/2020"), "A��o/Aventura");
		Movie m6 = new Movie("007: SEM TEMPO PARA MORRER", sdf.parse("09/04/2020"), "A��o/Aventura");
		Movie m7 = new Movie("TROLLS 2", sdf.parse("16/04/2020"), "Anima��o/comedia");
		Movie m8 = new Movie("TOP GUN: MAVERICK", sdf.parse("09/07/2020"), "A��o");
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		list.add(m8);
		
	}
	
}
