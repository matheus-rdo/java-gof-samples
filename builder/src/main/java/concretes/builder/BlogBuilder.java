package concretes.builder;

import abstracts.Artigo;
import abstracts.ArtigoBuilder;
import concretes.artigo.Blog;

import java.time.LocalDate;
import java.util.Arrays;

public class BlogBuilder implements ArtigoBuilder {

	private Artigo artigo;

	public BlogBuilder() {
		this.artigo = new Blog();
	}

	public static ArtigoBuilder builder() {
		return new BlogBuilder();
	}

	@Override
	public ArtigoBuilder autor(String autor) {
		artigo.setAutor(autor);
		return this;
	}

	@Override
	public ArtigoBuilder titulo(String titulo) {
		artigo.setTitulo(titulo);
		return this;
	}

	@Override
	public ArtigoBuilder assuntos(String... assuntos) {
		artigo.setMarcacoes(Arrays.asList(assuntos));
		return this;
	}

	@Override
	public ArtigoBuilder totalDePaginas(int total) {
		artigo.setPaginas(total);
		return this;
	}

	@Override
	public ArtigoBuilder publicadoEm(int dia, int mes, int ano) {
		artigo.setDataPublicacao(LocalDate.of(ano, mes, dia));
		return this;
	}

	@Override
	public ArtigoBuilder texto(String texto) {
		artigo.setTexto(texto);
		return this;
	}

	@Override
	public Artigo build() {
		return artigo;
	}
}
