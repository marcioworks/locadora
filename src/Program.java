import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		List<Movie> list = new LinkedList<Movie>();
		
		Scanner sc = new Scanner(System.in);
		
		Menu.callMenu();
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1: {
			
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
		
		
		

	}

}
