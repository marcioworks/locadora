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
		while (opcao != 0) {
			System.out.println();
			Menu.callMenu();
			System.out.println("Escolha uma op��o");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 0: {
				System.out.println("OBRIGADO POR USAR NOSSO SISTEMA.");
				break;
			}
			case 1: {
				for (Movie m : list) {
					System.out.println(m);

				}
				break;
			}
			case 2: {
				System.out.print("Titulo do filme: ");
				sc.nextLine();
				String titulo = sc.nextLine();
				System.out.print("ano e Lan�amento: ");
				String release = sc.nextLine();
				System.out.print("Genero do filme: ");
				String Genero = sc.nextLine();
				list.add(new Movie(titulo, sdf.parse(release), Genero));
				
				System.out.println("Filme adcionado a lista.");
				break;
			}
			case 3:{
				
				break;
			}
			default:
				System.out.println("opcao invalida.");
			}

		}
	}

}
