import abstracts.Artigo;
import concretes.builder.BlogBuilder;
import concretes.builder.JornalBuilder;
import concretes.builder.RevistaBuilder;

public class BuilderClient {

	public static void main(String[] args) {
		Artigo blog = BlogBuilder.builder()
				.autor("Marcio Ballem")
				.titulo("BlogBuilder")
				.assuntos("builder pattern", "java")
				.publicadoEm(20, 3, 2005)
				.texto("O padrão de projeto builder...")
				.build();

		System.out.println(blog.toString());

		Artigo jornal = JornalBuilder.builder()
				.autor("Marcio Ballem")
				.titulo("JornalBuilder")
				.assuntos("builder pattern", "java")
				.publicadoEm(25, 5, 2008)
				.texto("O padrão de projeto builder...")
				.totalDePaginas(1)
				.build();

		System.out.println(jornal.toString());

		Artigo revista = RevistaBuilder.builder()
				.autor("Marcio Ballem")
				.titulo("RevistaBuilder")
				.assuntos("builder pattern", "java")
				.publicadoEm(25, 5, 2008)
				.texto("O padrão de projeto builder...")
				.totalDePaginas(6)
				.build();

		System.out.println(revista.toString());
	}

}
