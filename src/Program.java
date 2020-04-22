import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		ArrayList<Movie> list = new ArrayList<Movie>();
		MockMovies.mockList(list);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		int opcao = 6;
		while (opcao != 0) {
			System.out.println();
			Menu.callMenu();
			System.out.println("Escolha uma opção");
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
				titulo = titulo.toUpperCase();
				System.out.print("ano e Lançamento: ");
				String release = sc.nextLine();
				System.out.print("Genero do filme: ");
				String Genero = sc.nextLine();
				list.add(new Movie(titulo, sdf.parse(release), Genero));
				
				System.out.println("Filme adcionado a lista.");
				break;
			}
			case 3:{
				System.out.print("Nome do filme: ");
				sc.nextLine();
				String search = sc.nextLine();
				search = search.toUpperCase();
				for(Movie m: list) {
					if(m.getTitulo().contains(search) ){
						System.out.println(m.getTitulo());
						System.out.println(list.indexOf(m ));
					}
				}
				break;
			}
			default:
				System.out.println("opcao invalida.");
			}

		}
		sc.close();
	}

}
