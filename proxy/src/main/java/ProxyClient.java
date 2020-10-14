import image.Image;
import image.proxy.ImageProxy;

/**
 * O Proxy é utilizado quando existe a necessidade de implementar objetos que exigem muitos recursos
 * mas este objeto só deve ser provisionado quando for requisitado pelo cliente por exemplo.
 *
 * Outro caso de uso é quando o image.proxy intermedia o controle de acesso, verificando se o cliente tem as permissões exigidas para que sua
 * requisição seja encaminhada e processada
 */
public class ProxyClient {

    public static void main(String[] args) throws InterruptedException {
        Image image = new ImageProxy("test_10mb.jpg");
        Thread.sleep(1000);

        // Apenas na rotina abaixo, a imagem será inicializada e carregada do disco
        image.display();

        System.out.println("-----");

        // Agora, a imagem será carrega da memória
        image.display();
    }
}
