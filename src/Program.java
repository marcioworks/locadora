import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		List<Movie> list = new LinkedList<Movie>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		Menu.callMenu();
		
		MockMovies.mockList(list);
		for(Movie m:list) {
			System.out.println(m);
		}
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1: {
			
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
		
		
		

	}

}
