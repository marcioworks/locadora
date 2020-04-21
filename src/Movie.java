import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Movie {

	private String titulo;
	private Date lancamento;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	

	public Movie() {

	}

	public Movie(String titulo, Date lancamento) {
		this.titulo = titulo;
		this.lancamento = lancamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) throws ParseException {
		this.lancamento = sdf.parse(lancamento);
	}

	@Override
	public String toString() {
		return "Titulo:" + titulo + ", ano de lançamento= " +sdf.format(lancamento);
	}
	
	

}
