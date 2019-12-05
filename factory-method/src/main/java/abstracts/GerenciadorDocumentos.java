package abstracts;

/**
 * Abstração capaz de manipular documentos
 * sem conhecer os detalhes de sua implementação.
 */
public abstract class GerenciadorDocumentos {

	protected Documento doc;

	/**
	 * Abstração do Factory Method
	 */
	protected abstract Documento criaDocumento();

	public void novoDocumento() {
		this.doc = this.criaDocumento();
	}

	public void abrirDocumento() {
		this.doc.abrir();
	}

	public void fecharDocumento() {
		this.doc.fechar();
	}
}
