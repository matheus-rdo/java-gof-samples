package abstracts;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public abstract class Artigo {

	private String autor;
	private String titulo;
	private List<String> marcacoes;
	private Integer paginas;
	private LocalDate dataPublicacao;
	private String texto;

}
