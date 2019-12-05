package factory;

import concretes.FacebookClient;
import concretes.LinkedinClient;
import concretes.TwitterClient;
import abstracts.SocialMediaClient;

public class SocialMediaFactory {

	public static SocialMediaClient getClient(SocialMedia socialMedia) {
		switch (socialMedia) {
			case FACEBOOK:
				return new FacebookClient();
			case TWITTER:
				return new TwitterClient();
			case LINKEDIN:
				return new LinkedinClient();
			default:
				throw new IllegalArgumentException("Unsupported media");
		}
	}

}
