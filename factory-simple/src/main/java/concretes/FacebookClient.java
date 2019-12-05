package concretes;

import abstracts.SocialMediaClient;

public class FacebookClient implements SocialMediaClient {

	@Override
	public void authenticate(String user, String password) {
		System.out.println("Autenticado com Facebook!");
	}

	@Override
	public void post(String message) {
		System.out.println("[Facebook] - " + message);
	}
}
