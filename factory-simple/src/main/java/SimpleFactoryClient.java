import factory.SocialMedia;
import factory.SocialMediaFactory;
import abstracts.SocialMediaClient;

public class SimpleFactoryClient {

	/**
	 * Objetivo: abstrair as regras de criação das classes concretas
	 * e isolamento das regras de negócio de cada uma delas
	 */
	public static void main(String[] args) {
		SocialMediaClient client = SocialMediaFactory.getClient(SocialMedia.FACEBOOK);
		client.authenticate("matheus", "123456");
		client.post("Meu post !!");
		// [...]
	}

}
