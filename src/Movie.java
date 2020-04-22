import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Movie {

	private String title;
	private Date release;
	private String genre;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Movie() {

	}

	public Movie(String titulo, Date lancamento, String genre) {
		this.title = titulo;
		this.release = lancamento;
		this.genre = genre;
	}

	public String getTitulo() {
		return title;
	}

	public void setTitulo(String titulo) {
		this.title = titulo;
	}

	public Date getLancamento() {
		return release;
	}

	public void setLancamento(String lancamento) throws ParseException {
		this.release = sdf.parse(lancamento);
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Titulo: " + title + ", ano de lançamento: " + sdf.format(release)+" Genero: "+genre;
	}

}
