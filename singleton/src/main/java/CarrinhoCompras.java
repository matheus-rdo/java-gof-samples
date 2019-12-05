import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CarrinhoCompras {

	private static CarrinhoCompras instance;

	private List<String> itens;

	/**
	 * Caso seja necessário impedir que outras classes instanciem novos "CarrinhoCompras"
	 */
	private CarrinhoCompras() {
		itens = List.of("Mouse", "Teclado", "Gabinete", "Monitor"); //Mock
	}

	public static CarrinhoCompras getInstance() {
		if (instance == null) {
			instance = new CarrinhoCompras();
		}

		return instance;
	}


}
