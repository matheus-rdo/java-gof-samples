import abstracts.GerenciadorDocumentos;
import concretes.GerenciadorPDF;

public class FactoryMethodClient {

	/**
	 * A chave deste padrão está na declaração do método abstrato criaDocumento da classe GerenciadorDocumentos
	 * e na sua utilização através do método novoDocumento
	 * <p>
	 * Este arranjo torna possível a criação de documentos sem conhecer os detalhes de implementação
	 * <p>
	 * Isso permite que a implementação do criaDocumento varie livremente e possa atender
	 * diversos formatos sem que seja necessário modificar o código das classes abstratas.
	 */
	public static void main(String[] args) {
		GerenciadorDocumentos gerenciador = new GerenciadorPDF();
		gerenciador.novoDocumento();
		gerenciador.abrirDocumento();
		gerenciador.fecharDocumento();
	}
}
