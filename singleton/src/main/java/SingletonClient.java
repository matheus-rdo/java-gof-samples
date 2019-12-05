public class SingletonClient {

	public static void main(String[] args) {
		//CarrinhoCompras carrinho = new CarrinhoCompras();  <--   (erro de compilação por causa do construtor)

		CarrinhoCompras carrinho = CarrinhoCompras.getInstance();
		System.out.println("Itens do carrinho = " + carrinho.getItens());
	}
}
