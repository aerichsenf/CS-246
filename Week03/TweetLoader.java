import twitter4j.Query;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by akuma on 1/20/17.
 */
public class TweetLoader {
    Twitter twitter;

    public TweetLoader() {
        ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("r28jY50pAhNjkaxxJKMe7GmZC")
                .setOAuthConsumerSecret("PTpzJtZ5WBznlMoTR4dc8a6xHjurBOwl5isBXOP3dfOqgrDwww")
                .setOAuthAccessToken("821615209953554432-NaAipS1JcFJvY56eDnVa53ih5DnW7Px")
                .setOAuthAccessTokenSecret("2j9tEqbFWYJPoVOgj6uEKsOwR270JgBKCe6LUcHXOnyas")
                .setJSONStoreEnabled(true);

        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter4j.Twitter twitter = tf.getInstance();
    }
}
   /* public Map retrieveTweetsWithHashTag(String hashtag) throws TwitterException {
        Map<String, Integer> treeMap = new TreeMap<String, Integer>();
        Query query = new Query("#byui");
        twitter.search(query);
        return twitter;

    }


}
*/