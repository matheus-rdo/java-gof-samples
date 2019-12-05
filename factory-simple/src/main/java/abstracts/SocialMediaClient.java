package abstracts;

public interface SocialMediaClient {

	void authenticate(String user, String password);

	void post(String message);

}
