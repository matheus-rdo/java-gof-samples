package concretes;

import abstracts.SocialMediaClient;

public class LinkedinClient implements SocialMediaClient {

	@Override
	public void authenticate(String user, String password) {
		System.out.println("Autenticado com Linkedin!");
	}

	@Override
	public void post(String message) {
		System.out.println("[Linkedin] - " + message);
	}
}
