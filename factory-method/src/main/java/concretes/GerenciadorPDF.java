package concretes;

import abstracts.GerenciadorDocumentos;
import abstracts.Documento;

public class GerenciadorPDF extends GerenciadorDocumentos {

	@Override
	protected Documento criaDocumento() {
		return new DocumentoPDF();
	}
}
