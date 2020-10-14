import libraries.TomadaDeDoisPinos;
import libraries.TomadaDeTresPinos;

/**
 * Adapter é comumente utilizado para compatibilizar um sistema com outro framework/biblioteca
 * Exemplo:
 *      - Um sistema já existente utiliza uma biblioteca de uma fornecedor X, e essa biblioteca foi deprecada.
 *      então o sistema deve gradualmente migrar a biblioteca para o fornecedor Y, que possui diversas otimizações mas possui um interface diferente
 *      nesse cenário, uma solução é implementar um adapter para adaptar a interface do novo fornecedor ao formato do fornecedor antigo, ao qual o já sistema espera.
 */
public class AdapterClient {

    public static void main(String[] args) {
        // Biblioteca legada
        TomadaDeDoisPinos t2 = new TomadaDeDoisPinos();
        ligarForninho(t2);

        TomadaDeTresPinos t3 = new TomadaDeTresPinos();
        TomadaAdapter tomadaAdapter = new TomadaAdapter(t3);
        ligarForninho(tomadaAdapter);
    }

    // Código legado - acoplado ao fornecedor X
    private static void ligarForninho(TomadaDeDoisPinos tomadaDeDoisPinos) {
        tomadaDeDoisPinos.ligarNaTomadaDeDoisPinos();
        System.out.println("Forninho está aquecendo!!");
    }
}
