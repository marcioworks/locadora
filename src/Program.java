import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		List<Movie> list = new LinkedList<Movie>();
		MockMovies.mockList(list);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		int opcao = 6;
		do {
			System.out.println();
			Menu.callMenu();
			System.out.println("Escolha uma opção");
			opcao = sc.nextInt();
			switch (opcao) {
			case 0:{
				System.out.println("OBRIGADO POR USAR NOSSO SISTEMA.");
				break;
			}
			case 1: {
				for (Movie m : list) {
					System.out.println(m);

				}
				break;
			}
			default:
				System.out.println("opcao invalida.");
			}
		} while (opcao != 0);

	}

}
